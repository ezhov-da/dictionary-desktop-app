/*   1:    */ package ru.ezhov.dictionary.dictionary;
/*   2:    */ 
/*   3:    */ import ru.ezhov.dictionary.tree.WorkWithTree;
/*   4:    */ import ru.ezhov.dictionary.forma.DictionaryFrame;
/*   5:    */ import java.awt.Color;
/*   6:    */ import java.awt.event.KeyAdapter;
/*   7:    */ import java.awt.event.KeyEvent;
/*   8:    */ import java.awt.event.MouseAdapter;
/*   9:    */ import java.awt.event.MouseEvent;
/*  10:    */ import java.io.IOException;
/*  11:    */ import java.sql.SQLException;
/*  12:    */ import java.util.logging.Level;
/*  13:    */ import java.util.logging.Logger;
/*  14:    */ import javax.swing.JPanel;
/*  15:    */ import javax.swing.JTextField;
/*  16:    */ import ru.ezhov.dictionary.publicClass.Query;
/*  17:    */ import ru.ezhov.dictionary.publicClass.SingletoneBasicFrame;
/*  18:    */ 
/*  19:    */ 
/*  20:    */ 
/*  21:    */ 
/*  22:    */ 
/*  23:    */ 
/*  24:    */ 
/*  25:    */ 
/*  26:    */ public class AddNewWord
/*  27:    */   extends MouseAdapter
/*  28:    */ {
/*  29:    */   public void mouseReleased(MouseEvent e)
/*  30:    */   {
/*  31: 31 */     final MyPopupMenuAddWord myPopupMenuAddWord = new MyPopupMenuAddWord();
/*  32: 32 */     myPopupMenuAddWord.run();
/*  33:    */     
/*  34:    */ 
/*  35: 35 */     myPopupMenuAddWord.jTextFieldTranslate.addKeyListener(new KeyAdapter()
/*  36:    */     {
/*  37:    */       public void keyReleased(KeyEvent e)
/*  38:    */       {
/*  39: 39 */         if (e.getKeyCode() == 10)
/*  40:    */         {
/*  41:    */ 
/*  42:    */ 
/*  43:    */ 
/*  44:    */ 
/*  45:    */ 
/*  46:    */ 
/*  47: 47 */           if (!myPopupMenuAddWord.jTextFieldTranslate.getText().equals(""))
/*  48:    */           {
/*  49: 49 */             String notMatch = SingletoneBasicFrame.getDictionaryFrame().jTextFieldWord.getText();
/*  50: 50 */             String description = myPopupMenuAddWord.jTextFieldTranslate.getText();
/*  51:    */             
/*  52:    */ 
/*  53:    */ 
/*  54:    */ 
/*  55: 55 */             int notMatchMass = notMatch.charAt(0);
/*  56: 56 */             int descriptionMass = description.charAt(0);
/*  57:    */             
/*  58:    */ 
/*  59:    */ 
/*  60:    */ 
/*  61:    */ 
/*  62:    */ 
/*  63:    */ 
/*  64:    */ 
/*  65:    */ 
/*  66:    */ 
/*  67:    */ 
/*  68: 68 */             String english = null;
/*  69: 69 */             String russian = null;
/*  70:    */             
/*  71:    */ 
/*  72: 72 */             if (((notMatchMass >= 1040 ? 1 : 0) & (notMatchMass <= 1103 ? 1 : 0) | (notMatchMass == 1025 ? 1 : 0)) != 0) {
/*  73: 73 */               russian = notMatch;
/*  74: 74 */             } else if (((notMatchMass >= 65 ? 1 : 0) & (notMatchMass <= 122 ? 1 : 0)) != 0) {
/*  75: 75 */               english = notMatch;
/*  76:    */             }
/*  77:    */             
/*  78:    */ 
/*  79: 79 */             if (((descriptionMass >= 1040 ? 1 : 0) & (descriptionMass <= 1103 ? 1 : 0) | (descriptionMass == 1025 ? 1 : 0)) != 0) {
/*  80: 80 */               russian = description;
/*  81: 81 */             } else if (((descriptionMass >= 65 ? 1 : 0) & (descriptionMass <= 122 ? 1 : 0)) != 0) {
/*  82: 82 */               english = description;
/*  83:    */             }
/*  84:    */             
/*  85:    */ 
/*  86:    */ 
/*  87: 87 */             if (((english != null ? 1 : 0) & (russian != null ? 1 : 0)) != 0) {
/*  88: 88 */               String zapros = "insert into BASEDICTIONARY(ENGLISH, RUSSIAN) VALUES('" + english.replace("'", "''''").trim() + "','" + russian.replace("'", "''''").trim() + "')";
/*  89:    */               try {
/*  90: 90 */                 new Query().insertToBase(zapros);
/*  91:    */               } catch (ClassNotFoundException ex) {
/*  92: 92 */                 Logger.getLogger(AddNewWord.class.getName()).log(Level.SEVERE, null, ex);
/*  93:    */               } catch (SQLException ex) {
/*  94: 94 */                 Logger.getLogger(AddNewWord.class.getName()).log(Level.SEVERE, null, ex);
/*  95:    */               } catch (IOException ex) {
/*  96: 96 */                 Logger.getLogger(AddNewWord.class.getName()).log(Level.SEVERE, null, ex);
/*  97:    */               }
/*  98:    */               
/*  99:    */               try
/* 100:    */               {
/* 101:101 */                 new Work().fillTable(SingletoneBasicFrame.getDictionaryFrame().jTableResult, SingletoneBasicFrame.getDictionaryFrame().jTextFieldWord.getText().toLowerCase(), SingletoneBasicFrame.getDictionaryFrame().jLabelMassage);
/* 102:    */                 
/* 103:    */ 
/* 104:104 */                 new WorkWithTree().run();
/* 105:    */               } catch (SQLException ex) {
/* 106:106 */                 Logger.getLogger(AddNewWord.class.getName()).log(Level.SEVERE, null, ex);
/* 107:    */               } catch (ClassNotFoundException ex) {
/* 108:108 */                 Logger.getLogger(AddNewWord.class.getName()).log(Level.SEVERE, null, ex);
/* 109:    */               } catch (IOException ex) {
/* 110:110 */                 Logger.getLogger(AddNewWord.class.getName()).log(Level.SEVERE, null, ex);
/* 111:    */               }
/* 112:    */             }
/* 113:    */             
/* 114:    */ 
/* 115:    */ 
/* 116:116 */             myPopupMenuAddWord.setVisible(false);
/* 117:    */           }
/* 118:    */           
/* 119:    */         }
/* 120:    */         
/* 121:    */       }
/* 122:122 */     });
/* 123:123 */     myPopupMenuAddWord.setBackground(new Color(255, 221, 155));
/* 124:124 */     myPopupMenuAddWord.show(e.getComponent(), e.getX() - 500 - myPopupMenuAddWord.jPanel1.getWidth(), e.getY() - 150 - myPopupMenuAddWord.jPanel1.getHeight());
/* 125:    */   }
/* 126:    */ }


/* Location:           E:\dictionary\Dictionary.jar
 * Qualified Name:     dictionary.AddNewWord
 * JD-Core Version:    0.7.0.1
 */