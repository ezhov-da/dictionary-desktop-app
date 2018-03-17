package ru.ezhov.dictionary.forma;

import javax.swing.*;
import java.awt.*;
import java.util.logging.Logger;

public class TestColor extends javax.swing.JFrame {
    public javax.swing.JButton jButtonAddNewWord;
    public javax.swing.JButton jButtonClear;
    public javax.swing.JLabel jLabelMassage;
    public javax.swing.JTable jTableResult;
    public javax.swing.JTextField jTextFieldWord;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;

    public TestColor() {
        initComponents();
    }

    private void initComponents() {
        this.jPanel2 = new JPanel();
        this.jPanel1 = new JPanel();
        this.jTextFieldWord = new javax.swing.JTextField();
        this.jButtonClear = new javax.swing.JButton();
        this.jScrollPane1 = new javax.swing.JScrollPane();
        this.jTableResult = new javax.swing.JTable();
        this.jPanel3 = new JPanel();
        this.jLabelMassage = new javax.swing.JLabel();
        this.jButtonAddNewWord = new javax.swing.JButton();

        setTitle("Перевод");
        setBackground(new Color(255, 194, 134));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setUndecorated(true);

        this.jPanel2.setBackground(new Color(153, 153, 255));
        this.jPanel2.setBorder(new javax.swing.border.LineBorder(new Color(255, 153, 0), 1, true));

        this.jPanel1.setBackground(new Color(153, 153, 255));
        this.jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(1), "Начните вводить слово:", 0, 2));

        this.jTextFieldWord.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TestColor.this.jTextFieldWordKeyReleased(evt);
            }

        });
        this.jButtonClear.setBackground(new Color(255, 153, 153));
        this.jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TestColor.this.jButtonClearActionPerformed(evt);
            }

        });
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jTextFieldWord).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButtonClear, -2, 21, -2)));

        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.jButtonClear, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.jTextFieldWord, GroupLayout.Alignment.LEADING)).addGap(0, 10, 32767)));

        this.jTableResult.setBackground(new Color(255, 194, 134));
        this.jTableResult.setModel(new javax.swing.table.DefaultTableModel());
        this.jTableResult.setGridColor(new Color(255, 194, 134));
        this.jTableResult.getTableHeader().setReorderingAllowed(false);
        this.jScrollPane1.setViewportView(this.jTableResult);

        this.jPanel3.setBackground(new Color(153, 153, 255));
        this.jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(1));

        this.jLabelMassage.setText("...");

        this.jButtonAddNewWord.setBackground(new Color(255, 153, 153));
        this.jButtonAddNewWord.setText("Добавить новое слово");

        GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
        this.jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabelMassage, -2, 406, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jButtonAddNewWord).addContainerGap()));

        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelMassage).addComponent(this.jButtonAddNewWord)).addContainerGap(-1, 32767)));

        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767).addComponent(this.jScrollPane1, -1, 686, 32767).addComponent(this.jPanel3, -1, -1, 32767)).addContainerGap()));

        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel1, -2, -1, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jScrollPane1, -2, 263, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel3, -2, -1, -2).addContainerGap(-1, 32767)));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel2, -1, -1, 32767));

        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel2, -2, -1, -2).addGap(0, 42, 32767)));

        pack();
    }

    private void jTextFieldWordKeyReleased(java.awt.event.KeyEvent evt) {
        try {
            if (evt.getKeyCode() == 27) setVisible(false);
            new ru.ezhov.dictionary.dictionary.Work().fillTable(this.jTableResult, this.jTextFieldWord.getText().toLowerCase(), this.jLabelMassage);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DictionaryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (java.sql.SQLException ex) {
            Logger.getLogger(DictionaryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (java.io.IOException ex) {
            Logger.getLogger(TestColor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {
        this.jTextFieldWord.setText("");
        try {
            new ru.ezhov.dictionary.dictionary.Work().fillTable(this.jTableResult, this.jTextFieldWord.getText().toLowerCase(), this.jLabelMassage);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DictionaryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (java.sql.SQLException ex) {
            Logger.getLogger(DictionaryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (java.io.IOException ex) {
            Logger.getLogger(TestColor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}