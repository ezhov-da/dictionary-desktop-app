package ru.ezhov.dictionary.dictionary;

import ru.ezhov.dictionary.publicClass.Query;
import ru.ezhov.dictionary.publicClass.SingletoneBasicFrame;
import ru.ezhov.dictionary.tree.WorkWithTree;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AddNewWord
        extends MouseAdapter {
    public void mouseReleased(MouseEvent e) {
        final MyPopupMenuAddWord myPopupMenuAddWord = new MyPopupMenuAddWord();
        myPopupMenuAddWord.run();

        myPopupMenuAddWord.jTextFieldTranslate.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == 10) {


                    if (!myPopupMenuAddWord.jTextFieldTranslate.getText().equals("")) {
                        String notMatch = SingletoneBasicFrame.getDictionaryFrame().jTextFieldWord.getText();
                        String description = myPopupMenuAddWord.jTextFieldTranslate.getText();

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
                            String zapros = "insert into BASEDICTIONARY(ENGLISH, RUSSIAN) VALUES('" + english.replace("'", "''''").trim() + "','" + russian.replace("'", "''''").trim() + "')";
                            try {
                                new Query().insertToBase(zapros);
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(AddNewWord.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (SQLException ex) {
                                Logger.getLogger(AddNewWord.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (IOException ex) {
                                Logger.getLogger(AddNewWord.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            try {
                                new Work().fillTable(SingletoneBasicFrame.getDictionaryFrame().jTableResult, SingletoneBasicFrame.getDictionaryFrame().jTextFieldWord.getText().toLowerCase(), SingletoneBasicFrame.getDictionaryFrame().jLabelMassage);


                                new WorkWithTree().run();
                            } catch (SQLException ex) {
                                Logger.getLogger(AddNewWord.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(AddNewWord.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (IOException ex) {
                                Logger.getLogger(AddNewWord.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }

                        myPopupMenuAddWord.setVisible(false);
                    }
                }
            }
        });
        myPopupMenuAddWord.setBackground(new Color(255, 221, 155));
        myPopupMenuAddWord.show(e.getComponent(), e.getX() - 500 - myPopupMenuAddWord.jPanel1.getWidth(), e.getY() - 150 - myPopupMenuAddWord.jPanel1.getHeight());
    }
}