package ru.ezhov.dictionary.dictionary;

import ru.ezhov.dictionary.publicClass.Query;
import ru.ezhov.dictionary.publicClass.SingletoneBasicFrame;
import ru.ezhov.dictionary.settings.MyTableCellRenderer;
import ru.ezhov.dictionary.settings.Setting;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Vector;


public class Work {
    public void setSettingTable(JTable table) {
        new Setting().setSettingTable(table);
    }

    public void fillTable(JTable table, String text, JLabel infoLabel)
            throws ClassNotFoundException, SQLException, IOException {
        Query queryObject = new Query();

        if (text.equals("")) {
            text = "asdfasdfjhkhghfl";
        }

        String zapros = "/*В данный запрос мы добавляем два столбца идентификатора(в конец)1. Обновить - r#$2. Удалить - d#$*/Select \nid,\nMATCH as \"...\",\nFIND,\nTRANSLATE, 'r#$' as r,'d#$' as d from (\n    select id,\n    case when trim(english) = '" + text + "' then 1 else 0 end as MATCH, \n" + "    english as FIND,\n" + "    russian  as TRANSLATE \n" + "from BASEDICTIONARY where LCase(english) like '%" + text + "%'\n" + "union all\n" + "    select id,\n" + "    case when (russian) = '" + text + "' then 1 else 0 end as MATCH, \n" + "    russian as FIND,\n" + "    english  as TRANSLATE  \n" + "    from BASEDICTIONARY where LCase(russian) like '%" + text + "%'\n" + ")order by MATCH desc,TRANSLATE";

        Object[] returnQueryObject = queryObject.selectTable(zapros);
        Vector row = (Vector) returnQueryObject[0];
        Vector columnHeads = (Vector) returnQueryObject[1];

        table.setModel(new DefaultTableModel(row, columnHeads));
        table.setAutoCreateRowSorter(false);

        table.addMouseListener(new TableClick());

        if ((row.isEmpty() & !text.equals("asdfasdfjhkhghfl"))) {
            infoLabel.setText("Найдено: " + row.size() + " совпадений. Может добавим слово? -->");

            SingletoneBasicFrame.getDictionaryFrame().jButtonAddNewWord.setVisible(true);
        } else {
            infoLabel.setText("Найдено: " + row.size() + " совпадений.");

            SingletoneBasicFrame.getDictionaryFrame().jButtonAddNewWord.setVisible(false);
        }

        TableColumnModel tcm = table.getColumnModel();

        tcm.getColumn(1).setCellRenderer(new MyTableCellRenderer());
        tcm.getColumn(4).setCellRenderer(new MyTableCellRenderer());
        tcm.getColumn(5).setCellRenderer(new MyTableCellRenderer());


        tcm.getColumn(1).setPreferredWidth(9);
        tcm.getColumn(1).setHeaderValue("*");

        tcm.getColumn(2).setPreferredWidth(302);

        tcm.getColumn(3).setPreferredWidth(302);

        tcm.getColumn(4).setPreferredWidth(9);
        tcm.getColumn(5).setPreferredWidth(9);


        tcm.getColumn(0).setPreferredWidth(0);
        tcm.getColumn(0).setPreferredWidth(0);
        tcm.getColumn(0).setMinWidth(0);
        tcm.getColumn(0).setMaxWidth(0);
    }
}