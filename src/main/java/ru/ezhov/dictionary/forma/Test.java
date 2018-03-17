package ru.ezhov.dictionary.forma;

import javax.swing.*;
import java.awt.*;

public class Test extends javax.swing.JFrame {
    public javax.swing.JTextField jTextFieldTranslate;
    private JLabel jLabel1;
    private JPanel jPanel1;

    public Test() {
        initComponents();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jTextFieldTranslate = new javax.swing.JTextField();
        this.jLabel1 = new JLabel();

        setDefaultCloseOperation(3);
        setBackground(new Color(255, 221, 155));

        this.jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(1), "Введите перевод слова:", 0, 2));

        this.jLabel1.setBackground(new Color(255, 194, 134));
        this.jLabel1.setText("После нажатия клавиши \"Enter\" слово добавится в словарь.");

        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jTextFieldTranslate).addComponent(this.jLabel1, -1, 419, 32767)).addContainerGap(-1, 32767)));

        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jTextFieldTranslate, -2, -1, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel1)));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel1, -2, -1, -2).addContainerGap(-1, 32767)));

        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel1, -2, -1, -2).addContainerGap(-1, 32767)));

        pack();
    }
}