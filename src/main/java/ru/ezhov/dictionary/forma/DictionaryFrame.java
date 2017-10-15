package ru.ezhov.dictionary.forma;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JPanel;

public class DictionaryFrame extends javax.swing.JFrame
{
    public javax.swing.JButton jButtonAddNewWord;
    public javax.swing.JButton jButtonClear;
    public javax.swing.JCheckBox jCheckBoxSettings;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabelMassage;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JPanel jPanel5;

    public DictionaryFrame()
    {
        initComponents();
    }

    private JPanel jPanel6;
    private JPanel jPanel7;
    private JPanel jPanel8;
    private JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;

    private void initComponents()
    {
        this.jPanel2 = new JPanel();
        this.jTabbedPane = new javax.swing.JTabbedPane();
        this.jPanel4 = new JPanel();
        this.jPanel3 = new JPanel();
        this.jLabelMassage = new javax.swing.JLabel();
        this.jButtonAddNewWord = new javax.swing.JButton();
        this.jScrollPane1 = new javax.swing.JScrollPane();
        this.jTableResult = new javax.swing.JTable();
        this.jPanel1 = new JPanel();
        this.jTextFieldWord = new javax.swing.JTextField();
        this.jButtonClear = new javax.swing.JButton();
        this.jPanel5 = new JPanel();
        this.jPanel6 = new JPanel();
        this.jScrollPane2 = new javax.swing.JScrollPane();
        this.jTreeBase = new javax.swing.JTree();
        this.jPanel7 = new JPanel();
        this.jPanel8 = new JPanel();
        this.jPanel9 = new JPanel();
        this.jLabel1 = new javax.swing.JLabel();
        this.jLabel2 = new javax.swing.JLabel();
        this.jTextFieldPathToBase = new javax.swing.JTextField();
        this.jTextFieldPathToURL = new javax.swing.JTextField();
        this.jCheckBoxSettings = new javax.swing.JCheckBox();

        setTitle("Перевод");
        setBackground(new java.awt.Color(255, 194, 134));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setUndecorated(true);

        this.jPanel2.setBackground(new java.awt.Color(255, 221, 155));
        this.jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));

        this.jTabbedPane.setBackground(new java.awt.Color(255, 153, 0));

        this.jPanel4.setBackground(new java.awt.Color(255, 221, 155));

        this.jPanel3.setBackground(new java.awt.Color(255, 194, 134));
        this.jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(1));

        this.jLabelMassage.setText("...");

        this.jButtonAddNewWord.setBackground(new java.awt.Color(204, 204, 255));
        this.jButtonAddNewWord.setText("Добавить новое слово");
        this.jButtonAddNewWord.setCursor(new java.awt.Cursor(12));

        GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
        this.jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabelMassage, -2, 406, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jButtonAddNewWord).addContainerGap()));

        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelMassage).addComponent(this.jButtonAddNewWord)).addContainerGap(-1, 32767)));

        this.jTableResult.setBackground(new java.awt.Color(255, 194, 134));
        this.jTableResult.setModel(new javax.swing.table.DefaultTableModel());
        this.jTableResult.setCursor(new java.awt.Cursor(12));
        this.jTableResult.setGridColor(new java.awt.Color(255, 194, 134));
        this.jTableResult.getTableHeader().setReorderingAllowed(false);
        this.jScrollPane1.setViewportView(this.jTableResult);

        this.jPanel1.setBackground(new java.awt.Color(255, 194, 134));
        this.jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(1), "Начните вводить слово:", 0, 2));

        this.jTextFieldWord.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                DictionaryFrame.this.jTextFieldWordActionPerformed(evt);
            }
        });
        this.jTextFieldWord.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                DictionaryFrame.this.jTextFieldWordKeyReleased(evt);
            }

        });
        this.jButtonClear.setBackground(new java.awt.Color(204, 204, 255));
        this.jButtonClear.setCursor(new java.awt.Cursor(12));
        this.jButtonClear.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                DictionaryFrame.this.jButtonClearActionPerformed(evt);
            }

        });
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jTextFieldWord).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButtonClear, -2, 21, -2)));

        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.jButtonClear, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.jTextFieldWord, GroupLayout.Alignment.LEADING)).addGap(0, 10, 32767)));

        GroupLayout jPanel4Layout = new GroupLayout(this.jPanel4);
        this.jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767).addComponent(this.jScrollPane1).addComponent(this.jPanel3, -1, -1, 32767)).addContainerGap()));

        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel1, -2, -1, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jScrollPane1, -2, 263, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel3, -2, -1, -2).addContainerGap(-1, 32767)));

        this.jTabbedPane.addTab("Поиск", this.jPanel4);

        this.jPanel5.setBackground(new java.awt.Color(255, 221, 155));

        this.jPanel6.setBackground(new java.awt.Color(255, 221, 155));

        this.jTreeBase.setBackground(new java.awt.Color(255, 194, 134));
        this.jScrollPane2.setViewportView(this.jTreeBase);

        GroupLayout jPanel6Layout = new GroupLayout(this.jPanel6);
        this.jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel6Layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane2, -1, 700, 32767).addContainerGap()));

        jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel6Layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane2, -1, 357, 32767).addContainerGap()));

        GroupLayout jPanel5Layout = new GroupLayout(this.jPanel5);
        this.jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel6, -1, -1, 32767).addContainerGap()));

        jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel6, -1, -1, 32767).addContainerGap()));

        this.jTabbedPane.addTab("База слов", this.jPanel5);

        this.jPanel7.setBackground(new java.awt.Color(255, 221, 155));

        this.jPanel8.setBackground(new java.awt.Color(255, 221, 155));

        this.jPanel9.setBackground(new java.awt.Color(255, 194, 134));
        this.jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(1), "Подключенная база:", 0, 2));

        this.jLabel1.setText("База:");

        this.jLabel2.setText("URL подключения:");

        this.jCheckBoxSettings.setBackground(new java.awt.Color(255, 194, 134));
        this.jCheckBoxSettings.setText("Сохранить подключение");

        GroupLayout jPanel9Layout = new GroupLayout(this.jPanel9);
        this.jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel9Layout.createSequentialGroup().addContainerGap().addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jTextFieldPathToBase, GroupLayout.Alignment.TRAILING).addGroup(jPanel9Layout.createSequentialGroup().addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel1).addComponent(this.jLabel2)).addGap(0, 0, 32767)).addGroup(jPanel9Layout.createSequentialGroup().addComponent(this.jTextFieldPathToURL, -1, 531, 32767).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jCheckBoxSettings))).addContainerGap()));

        jPanel9Layout.setVerticalGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel9Layout.createSequentialGroup().addComponent(this.jLabel1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jTextFieldPathToBase, -2, -1, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jTextFieldPathToURL, -2, -1, -2).addComponent(this.jCheckBoxSettings)).addGap(0, 10, 32767)));

        GroupLayout jPanel8Layout = new GroupLayout(this.jPanel8);
        this.jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel9, -1, -1, 32767));

        jPanel8Layout.setVerticalGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel8Layout.createSequentialGroup().addComponent(this.jPanel9, -2, -1, -2).addGap(0, 258, 32767)));

        GroupLayout jPanel7Layout = new GroupLayout(this.jPanel7);
        this.jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel7Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel8, -1, -1, 32767).addContainerGap()));

        jPanel7Layout.setVerticalGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel7Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel8, -1, -1, 32767).addContainerGap()));

        this.jTabbedPane.addTab("Настройки", this.jPanel7);

        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(this.jTabbedPane).addContainerGap()));

        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(this.jTabbedPane, -2, 426, -2).addContainerGap(-1, 32767)));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel2, -1, -1, 32767));

        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel2, -2, -1, -2));

        pack();
    }

    public javax.swing.JTabbedPane jTabbedPane;

    private void jTextFieldWordKeyReleased(java.awt.event.KeyEvent evt)
    {
        try
        {
            if (evt.getKeyCode() == 27)
            {
                setVisible(false);
            }
            new ru.ezhov.dictionary.dictionary.Work().fillTable(this.jTableResult, this.jTextFieldWord.getText().toLowerCase(), this.jLabelMassage);
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(DictionaryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (java.sql.SQLException ex)
        {
            java.util.logging.Logger.getLogger(DictionaryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (java.io.IOException ex)
        {
            java.util.logging.Logger.getLogger(DictionaryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    public javax.swing.JTable jTableResult;
    public javax.swing.JTextField jTextFieldPathToBase;

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt)
    {
        this.jTextFieldWord.setText("");
        try
        {
            new ru.ezhov.dictionary.dictionary.Work().fillTable(this.jTableResult, this.jTextFieldWord.getText().toLowerCase(), this.jLabelMassage);
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(DictionaryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (java.sql.SQLException ex)
        {
            java.util.logging.Logger.getLogger(DictionaryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (java.io.IOException ex)
        {
            java.util.logging.Logger.getLogger(DictionaryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    public javax.swing.JTextField jTextFieldPathToURL;
    public javax.swing.JTextField jTextFieldWord;
    public javax.swing.JTree jTreeBase;

    private void jTextFieldWordActionPerformed(java.awt.event.ActionEvent evt)
    {
    }
}
