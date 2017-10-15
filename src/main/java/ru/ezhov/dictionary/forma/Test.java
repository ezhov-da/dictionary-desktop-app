/*  1:   */ package ru.ezhov.dictionary.forma;
/*  2:   */ 
/*  3:   */ import java.awt.Color;
/*  4:   */ import javax.swing.GroupLayout;
/*  5:   */ import javax.swing.GroupLayout.Alignment;
/*  6:   */ import javax.swing.GroupLayout.ParallelGroup;
/*  7:   */ import javax.swing.GroupLayout.SequentialGroup;
/*  8:   */ import javax.swing.JLabel;
/*  9:   */ import javax.swing.JPanel;
/* 10:   */ 
/* 11:   */ public class Test extends javax.swing.JFrame
/* 12:   */ {
/* 13:   */   private JLabel jLabel1;
/* 14:   */   private JPanel jPanel1;
/* 15:   */   public javax.swing.JTextField jTextFieldTranslate;
/* 16:   */   
/* 17:   */   public Test()
/* 18:   */   {
/* 19:19 */     initComponents();
/* 20:   */   }
/* 21:   */   
/* 22:   */ 
/* 23:   */ 
/* 24:   */ 
/* 25:   */ 
/* 26:   */ 
/* 27:   */ 
/* 28:   */ 
/* 29:   */   private void initComponents()
/* 30:   */   {
/* 31:31 */     this.jPanel1 = new JPanel();
/* 32:32 */     this.jTextFieldTranslate = new javax.swing.JTextField();
/* 33:33 */     this.jLabel1 = new JLabel();
/* 34:   */     
/* 35:35 */     setDefaultCloseOperation(3);
/* 36:36 */     setBackground(new Color(255, 221, 155));
/* 37:   */     
/* 38:38 */     this.jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(1), "Введите перевод слова:", 0, 2));
/* 39:   */     
/* 40:40 */     this.jLabel1.setBackground(new Color(255, 194, 134));
/* 41:41 */     this.jLabel1.setText("После нажатия клавиши \"Enter\" слово добавится в словарь.");
/* 42:   */     
/* 43:43 */     GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
/* 44:44 */     this.jPanel1.setLayout(jPanel1Layout);
/* 45:45 */     jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jTextFieldTranslate).addComponent(this.jLabel1, -1, 419, 32767)).addContainerGap(-1, 32767)));
/* 46:   */     
/* 47:   */ 
/* 48:   */ 
/* 49:   */ 
/* 50:   */ 
/* 51:   */ 
/* 52:   */ 
/* 53:   */ 
/* 54:54 */     jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jTextFieldTranslate, -2, -1, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel1)));
/* 55:   */     
/* 56:   */ 
/* 57:   */ 
/* 58:   */ 
/* 59:   */ 
/* 60:   */ 
/* 61:   */ 
/* 62:62 */     GroupLayout layout = new GroupLayout(getContentPane());
/* 63:63 */     getContentPane().setLayout(layout);
/* 64:64 */     layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel1, -2, -1, -2).addContainerGap(-1, 32767)));
/* 65:   */     
/* 66:   */ 
/* 67:   */ 
/* 68:   */ 
/* 69:   */ 
/* 70:   */ 
/* 71:71 */     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel1, -2, -1, -2).addContainerGap(-1, 32767)));
/* 72:   */     
/* 73:   */ 
/* 74:   */ 
/* 75:   */ 
/* 76:   */ 
/* 77:   */ 
/* 78:   */ 
/* 79:79 */     pack();
/* 80:   */   }
/* 81:   */ }



/* Location:           E:\dictionary\Dictionary.jar

 * Qualified Name:     forma.Test

 * JD-Core Version:    0.7.0.1

 */