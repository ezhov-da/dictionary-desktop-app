/*   1:    */ package ru.ezhov.dictionary.dictionary;
/* 2: */
/* 3: */ import ru.ezhov.dictionary.forma.DictionaryFrame;
/* 4: */ import java.awt.Color;
/* 5: */ import javax.swing.BorderFactory;
/* 6: */ import javax.swing.GroupLayout;
/* 7: */ import javax.swing.GroupLayout.Alignment;
/* 8: */ import javax.swing.GroupLayout.ParallelGroup;
/* 9: */ import javax.swing.GroupLayout.SequentialGroup;
/* 10: */ import javax.swing.JLabel;
/* 11: */ import javax.swing.JPanel;
/* 12: */ import javax.swing.JPopupMenu;
/* 13: */ import javax.swing.JTextField;
import javax.swing.LayoutStyle;
/* 14: */ import javax.swing.LayoutStyle.ComponentPlacement;
/* 15: */ import javax.swing.border.SoftBevelBorder;
/* 16: */ import ru.ezhov.dictionary.publicClass.SingletoneBasicFrame;
/* 17: */
/* 18: */
/* 19: */
/* 20: */
/* 21: */
/* 22: */
/* 23: */
/* 24: */
/* 25: */
/* 26: */
/* 27: */
/* 28: */
/* 29: */
/* 30: */
/* 31: */
/* 32: */
/* 33: */
/* 34: */
/* 35: */
/* 36: */
/* 37: */
/* 38: */
/* 39: */
/* 40: */
/* 41: */
/* 42: */
/* 43: */
/* 44: */
/* 45: */
/* 46: */
/* 47: */
/* 48: */
/* 49: */
/* 50: */
/* 51: */
/* 52: */
/* 53: */
/* 54: */
/* 55: */
/* 56: */
/* 57: */
/* 58: */
/* 59: */
/* 60: */
/* 61: */
/* 62: */
/* 63: */
/* 64: */
/* 65: */
/* 66: */
/* 67: */
/* 68: */
/* 69: */
/* 70: */
/* 71: */
/* 72: */
/* 73: */
/* 74: */
/* 75: */
/* 76: */
/* 77: */
/* 78: */
/* 79: */
/* 80: */
/* 81: */
/* 82: */
/* 83: */
/* 84: */
/* 85: */
/* 86: */
/* 87: */
/* 88: */
/* 89: */
/* 90: */
/* 91: */
/* 92: */
/* 93: */
/* 94: */
/* 95: */
/* 96: */
/* 97: */
/* 98: */
/* 99: */
/* 100: */
/* 101: */
/* 102: */
/* 103: */
/* 104: */
/* 105: */
/* 106: */
/* 107: */
/* 108: */
/* 109: */
/* 110: */
/* 111: */
/* 112: */
/* 113: */
/* 114: */
/* 115: */
/* 116: */
/* 117: */
/* 118: */
/* 119: */
/* 120: */
/* 121: */
/* 122: */
/* 123: */
/* 124: */
/* 125: */
/* 126: */
/* 127: */
/* 128: */
/* 129: */
/* 130: */
/* 131: */
/* 132: */
/* 133: */
/* 134: */
/* 135: */ class MyPopupMenuAddWord
        /* 136: */ extends JPopupMenu
/* 137: */ {
    /* 138:138 */ JPanel jPanel1 = new JPanel();
    /* 139:139 */    JTextField jTextFieldTranslate = new JTextField();
    /* 140:140 */    JLabel jLabel1 = new JLabel();
    /* 141: */
    /* 142: */ public void run()
    /* 143: */ {
        /* 144:144 */ this.jPanel1.setBorder(BorderFactory.createTitledBorder(new SoftBevelBorder(1), "Введите перевод слова: " + SingletoneBasicFrame.getDictionaryFrame().jTextFieldWord.getText(), 0, 2));
        /* 145: */
        /* 146:146 */ this.jPanel1.setBackground(new Color(255, 194, 134));
        /* 147:147 */ this.jLabel1.setText("После нажатия клавиши \"Enter\" слово добавится в словарь.");
        /* 148: */
        /* 149:149 */ GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        /* 150:150 */ this.jPanel1.setLayout(jPanel1Layout);
        /* 151:151 */ jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jTextFieldTranslate).addComponent(this.jLabel1, -1, 419, 32767)).addContainerGap(-1, 32767)));
        /* 152: */
        /* 153: */
        /* 154: */
        /* 155: */
        /* 156: */
        /* 157: */
        /* 158: */
        /* 159: */
        /* 160:160 */ jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jTextFieldTranslate, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel1)));
        /* 161: */
        /* 162: */
        /* 163: */
        /* 164: */
        /* 165: */
        /* 166: */
        /* 167: */
        /* 168:168 */ GroupLayout layout = new GroupLayout(this);
        /* 169:169 */ setLayout(layout);
        /* 170:170 */ layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel1, -2, -1, -2).addContainerGap(-1, 32767)));
        /* 171: */
        /* 172: */
        /* 173: */
        /* 174: */
        /* 175: */
        /* 176: */
        /* 177:177 */ layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel1, -2, -1, -2).addContainerGap(-1, 32767)));
        /* 178: */
        /* 179: */
        /* 180: */
        /* 181: */
        /* 182: */
        /* 183: */
        /* 184: */
        /* 185:185 */ pack();
        /* 186: */    }
    /* 187: */ }



/* Location:           E:\dictionary\App.jar

 * Qualified Name:     dictionary.MyPopupMenuAddWord

 * JD-Core Version:    0.7.0.1

 */
