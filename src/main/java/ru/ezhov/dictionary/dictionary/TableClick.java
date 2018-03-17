package ru.ezhov.dictionary.dictionary;

import ru.ezhov.dictionary.forma.DictionaryFrame;
import ru.ezhov.dictionary.publicClass.Query;
import ru.ezhov.dictionary.publicClass.SingletoneBasicFrame;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TableClick
        extends MouseAdapter {
    JTable table;

    public void mouseReleased(MouseEvent e) {
        try {
            this.table = ((JTable) e.getSource());
            int selectedColumn = this.table.getSelectedColumn();

            if (selectedColumn == 4) refreshRow();
            if (selectedColumn == 5) deleteRow();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TableClick.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TableClick.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TableClick.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void refreshRow()
            throws ClassNotFoundException, IOException {
        String notMatch = this.table.getValueAt(this.table.getSelectedRow(), 2).toString();
        String description = this.table.getValueAt(this.table.getSelectedRow(), 3).toString();

        int notMatchMass = notMatch.charAt(0);
        int descriptionMass = description.charAt(0);

        String english = null;
        String russian = null;

        if (((notMatchMass >= 1040 ? 1 : 0) & (notMatchMass <= 1103 ? 1 : 0) | (notMatchMass == 1025 ? 1 : 0)) != 0) {
            russian = notMatch;
        } else if (((notMatchMass >= 65 ? 1 : 0) & (notMatchMass <= 122 ? 1 : 0)) != 0) {
            english = notMatch;
        }

        if (((descriptionMass >= 1040 ? 1 : 0) & (descriptionMass <= 1103 ? 1 : 0) | (descriptionMass == 1025 ? 1 : 0)) != 0) {
            russian = description;
        } else if (((descriptionMass >= 65 ? 1 : 0) & (descriptionMass <= 122 ? 1 : 0)) != 0) {
            english = description;
        }

        if (((english != null ? 1 : 0) & (russian != null ? 1 : 0)) != 0) {
            String zapros = "update BASEDICTIONARY set ENGLISH = '" + english + "', RUSSIAN = '" + russian + "' where id = '" + getIDRow() + "'";
            try {
                new Query().insertToBase(zapros);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AddNewWord.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(AddNewWord.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                new Work().fillTable(SingletoneBasicFrame.getDictionaryFrame().jTableResult, SingletoneBasicFrame.getDictionaryFrame().jTextFieldWord.getText().toLowerCase(), SingletoneBasicFrame.getDictionaryFrame().jLabelMassage);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AddNewWord.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(AddNewWord.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void deleteRow()
            throws ClassNotFoundException, SQLException, IOException {
        String zapros = "delete from BASEDICTIONARY where id = '" + getIDRow() + "'";
        new Query().deleteToBase(zapros);
        try {
            new Work().fillTable(SingletoneBasicFrame.getDictionaryFrame().jTableResult, SingletoneBasicFrame.getDictionaryFrame().jTextFieldWord.getText().toLowerCase(), SingletoneBasicFrame.getDictionaryFrame().jLabelMassage);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DictionaryFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DictionaryFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String getIDRow() {
        return this.table.getValueAt(this.table.getSelectedRow(), 0).toString();
    }
}