package ru.ezhov.dictionary.dictionary;

import ru.ezhov.dictionary.publicClass.SingletoneBasicFrame;

import javax.swing.*;
import javax.swing.border.SoftBevelBorder;
import java.awt.*;


class MyPopupMenuAddWord
        extends JPopupMenu {
    JPanel jPanel1 = new JPanel();
    JTextField jTextFieldTranslate = new JTextField();
    JLabel jLabel1 = new JLabel();

    public void run() {
        this.jPanel1.setBorder(BorderFactory.createTitledBorder(new SoftBevelBorder(1), "Введите перевод слова: " + SingletoneBasicFrame.getDictionaryFrame().jTextFieldWord.getText(), 0, 2));

        this.jPanel1.setBackground(new Color(255, 194, 134));
        this.jLabel1.setText("После нажатия клавиши \"Enter\" слово добавится в словарь.");

        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jTextFieldTranslate).addComponent(this.jLabel1, -1, 419, 32767)).addContainerGap(-1, 32767)));

        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jTextFieldTranslate, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel1)));

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel1, -2, -1, -2).addContainerGap(-1, 32767)));

        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel1, -2, -1, -2).addContainerGap(-1, 32767)));

        pack();
    }
}