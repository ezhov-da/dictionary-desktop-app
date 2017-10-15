/*   1:    */ package ru.ezhov.dictionary.forma;
/*   2:    */ 
/*   3:    */ import java.awt.Color;
/*   4:    */ import java.util.logging.Logger;
/*   5:    */ import javax.swing.GroupLayout;
/*   6:    */ import javax.swing.GroupLayout.Alignment;
/*   7:    */ import javax.swing.GroupLayout.ParallelGroup;
/*   8:    */ import javax.swing.GroupLayout.SequentialGroup;
/*   9:    */ import javax.swing.JPanel;
/*  10:    */ 
/*  11:    */ public class TestColor extends javax.swing.JFrame
/*  12:    */ {
/*  13:    */   public javax.swing.JButton jButtonAddNewWord;
/*  14:    */   public javax.swing.JButton jButtonClear;
/*  15:    */   public javax.swing.JLabel jLabelMassage;
/*  16:    */   private JPanel jPanel1;
/*  17:    */   private JPanel jPanel2;
/*  18:    */   private JPanel jPanel3;
/*  19:    */   private javax.swing.JScrollPane jScrollPane1;
/*  20:    */   public javax.swing.JTable jTableResult;
/*  21:    */   public javax.swing.JTextField jTextFieldWord;
/*  22:    */   
/*  23:    */   public TestColor()
/*  24:    */   {
/*  25: 25 */     initComponents();
/*  26:    */   }
/*  27:    */   
/*  28:    */ 
/*  29:    */ 
/*  30:    */ 
/*  31:    */ 
/*  32:    */ 
/*  33:    */ 
/*  34:    */ 
/*  35:    */   private void initComponents()
/*  36:    */   {
/*  37: 37 */     this.jPanel2 = new JPanel();
/*  38: 38 */     this.jPanel1 = new JPanel();
/*  39: 39 */     this.jTextFieldWord = new javax.swing.JTextField();
/*  40: 40 */     this.jButtonClear = new javax.swing.JButton();
/*  41: 41 */     this.jScrollPane1 = new javax.swing.JScrollPane();
/*  42: 42 */     this.jTableResult = new javax.swing.JTable();
/*  43: 43 */     this.jPanel3 = new JPanel();
/*  44: 44 */     this.jLabelMassage = new javax.swing.JLabel();
/*  45: 45 */     this.jButtonAddNewWord = new javax.swing.JButton();
/*  46:    */     
/*  47: 47 */     setTitle("Перевод");
/*  48: 48 */     setBackground(new Color(255, 194, 134));
/*  49: 49 */     setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
/*  50: 50 */     setUndecorated(true);
/*  51:    */     
/*  52: 52 */     this.jPanel2.setBackground(new Color(153, 153, 255));
/*  53: 53 */     this.jPanel2.setBorder(new javax.swing.border.LineBorder(new Color(255, 153, 0), 1, true));
/*  54:    */     
/*  55: 55 */     this.jPanel1.setBackground(new Color(153, 153, 255));
/*  56: 56 */     this.jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(1), "Начните вводить слово:", 0, 2));
/*  57:    */     
/*  58: 58 */     this.jTextFieldWord.addKeyListener(new java.awt.event.KeyAdapter() {
/*  59:    */       public void keyReleased(java.awt.event.KeyEvent evt) {
/*  60: 60 */         TestColor.this.jTextFieldWordKeyReleased(evt);
/*  61:    */       }
/*  62:    */       
/*  63: 63 */     });
/*  64: 64 */     this.jButtonClear.setBackground(new Color(255, 153, 153));
/*  65: 65 */     this.jButtonClear.addActionListener(new java.awt.event.ActionListener() {
/*  66:    */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  67: 67 */         TestColor.this.jButtonClearActionPerformed(evt);
/*  68:    */       }
/*  69:    */       
/*  70: 70 */     });
/*  71: 71 */     GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
/*  72: 72 */     this.jPanel1.setLayout(jPanel1Layout);
/*  73: 73 */     jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jTextFieldWord).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButtonClear, -2, 21, -2)));
/*  74:    */     
/*  75:    */ 
/*  76:    */ 
/*  77:    */ 
/*  78:    */ 
/*  79:    */ 
/*  80:    */ 
/*  81: 81 */     jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.jButtonClear, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.jTextFieldWord, GroupLayout.Alignment.LEADING)).addGap(0, 10, 32767)));
/*  82:    */     
/*  83:    */ 
/*  84:    */ 
/*  85:    */ 
/*  86:    */ 
/*  87:    */ 
/*  88:    */ 
/*  89:    */ 
/*  90: 90 */     this.jTableResult.setBackground(new Color(255, 194, 134));
/*  91: 91 */     this.jTableResult.setModel(new javax.swing.table.DefaultTableModel());
/*  92: 92 */     this.jTableResult.setGridColor(new Color(255, 194, 134));
/*  93: 93 */     this.jTableResult.getTableHeader().setReorderingAllowed(false);
/*  94: 94 */     this.jScrollPane1.setViewportView(this.jTableResult);
/*  95:    */     
/*  96: 96 */     this.jPanel3.setBackground(new Color(153, 153, 255));
/*  97: 97 */     this.jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(1));
/*  98:    */     
/*  99: 99 */     this.jLabelMassage.setText("...");
/* 100:    */     
/* 101:101 */     this.jButtonAddNewWord.setBackground(new Color(255, 153, 153));
/* 102:102 */     this.jButtonAddNewWord.setText("Добавить новое слово");
/* 103:    */     
/* 104:104 */     GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
/* 105:105 */     this.jPanel3.setLayout(jPanel3Layout);
/* 106:106 */     jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabelMassage, -2, 406, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jButtonAddNewWord).addContainerGap()));
/* 107:    */     
/* 108:    */ 
/* 109:    */ 
/* 110:    */ 
/* 111:    */ 
/* 112:    */ 
/* 113:    */ 
/* 114:    */ 
/* 115:115 */     jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelMassage).addComponent(this.jButtonAddNewWord)).addContainerGap(-1, 32767)));
/* 116:    */     
/* 117:    */ 
/* 118:    */ 
/* 119:    */ 
/* 120:    */ 
/* 121:    */ 
/* 122:    */ 
/* 123:    */ 
/* 124:    */ 
/* 125:125 */     GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
/* 126:126 */     this.jPanel2.setLayout(jPanel2Layout);
/* 127:127 */     jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767).addComponent(this.jScrollPane1, -1, 686, 32767).addComponent(this.jPanel3, -1, -1, 32767)).addContainerGap()));
/* 128:    */     
/* 129:    */ 
/* 130:    */ 
/* 131:    */ 
/* 132:    */ 
/* 133:    */ 
/* 134:    */ 
/* 135:    */ 
/* 136:    */ 
/* 137:137 */     jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel1, -2, -1, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jScrollPane1, -2, 263, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel3, -2, -1, -2).addContainerGap(-1, 32767)));
/* 138:    */     
/* 139:    */ 
/* 140:    */ 
/* 141:    */ 
/* 142:    */ 
/* 143:    */ 
/* 144:    */ 
/* 145:    */ 
/* 146:    */ 
/* 147:    */ 
/* 148:    */ 
/* 149:149 */     GroupLayout layout = new GroupLayout(getContentPane());
/* 150:150 */     getContentPane().setLayout(layout);
/* 151:151 */     layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel2, -1, -1, 32767));
/* 152:    */     
/* 153:    */ 
/* 154:    */ 
/* 155:155 */     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel2, -2, -1, -2).addGap(0, 42, 32767)));
/* 156:    */     
/* 157:    */ 
/* 158:    */ 
/* 159:    */ 
/* 160:    */ 
/* 161:    */ 
/* 162:162 */     pack();
/* 163:    */   }
/* 164:    */   
/* 165:    */   private void jTextFieldWordKeyReleased(java.awt.event.KeyEvent evt) {
/* 166:    */     try {
/* 167:167 */       if (evt.getKeyCode() == 27) setVisible(false);
/* 168:168 */       new ru.ezhov.dictionary.dictionary.Work().fillTable(this.jTableResult, this.jTextFieldWord.getText().toLowerCase(), this.jLabelMassage);
/* 169:    */     } catch (ClassNotFoundException ex) {
/* 170:170 */       Logger.getLogger(DictionaryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/* 171:    */     } catch (java.sql.SQLException ex) {
/* 172:172 */       Logger.getLogger(DictionaryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/* 173:    */     } catch (java.io.IOException ex) {
/* 174:174 */       Logger.getLogger(TestColor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/* 175:    */     }
/* 176:    */   }
/* 177:    */   
/* 178:    */   private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {
/* 179:179 */     this.jTextFieldWord.setText("");
/* 180:    */     try {
/* 181:181 */       new ru.ezhov.dictionary.dictionary.Work().fillTable(this.jTableResult, this.jTextFieldWord.getText().toLowerCase(), this.jLabelMassage);
/* 182:    */     } catch (ClassNotFoundException ex) {
/* 183:183 */       Logger.getLogger(DictionaryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/* 184:    */     } catch (java.sql.SQLException ex) {
/* 185:185 */       Logger.getLogger(DictionaryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/* 186:    */     } catch (java.io.IOException ex) {
/* 187:187 */       Logger.getLogger(TestColor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/* 188:    */     }
/* 189:    */   }
/* 190:    */ }



/* Location:           E:\dictionary\Dictionary.jar

 * Qualified Name:     forma.TestColor

 * JD-Core Version:    0.7.0.1

 */