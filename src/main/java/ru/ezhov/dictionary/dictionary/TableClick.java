/*   1:    */ package ru.ezhov.dictionary.dictionary;
/*   2:    */ 
/*   3:    */ import ru.ezhov.dictionary.forma.DictionaryFrame;
/*   4:    */ import java.awt.event.MouseAdapter;
/*   5:    */ import java.awt.event.MouseEvent;
/*   6:    */ import java.io.IOException;
/*   7:    */ import java.sql.SQLException;
/*   8:    */ import java.util.logging.Level;
/*   9:    */ import java.util.logging.Logger;
/*  10:    */ import javax.swing.JTable;
/*  11:    */ import javax.swing.JTextField;
/*  12:    */ import ru.ezhov.dictionary.publicClass.Query;
/*  13:    */ import ru.ezhov.dictionary.publicClass.SingletoneBasicFrame;
/*  14:    */ 
/*  15:    */ 
/*  16:    */ 
/*  17:    */ 
/*  18:    */ 
/*  19:    */ 
/*  20:    */ 
/*  21:    */ 
/*  22:    */ public class TableClick
/*  23:    */   extends MouseAdapter
/*  24:    */ {
/*  25:    */   JTable table;
/*  26:    */   
/*  27:    */   public void mouseReleased(MouseEvent e)
/*  28:    */   {
/*  29:    */     try
/*  30:    */     {
/*  31: 31 */       this.table = ((JTable)e.getSource());
/*  32: 32 */       int selectedColumn = this.table.getSelectedColumn();
/*  33:    */       
/*  34: 34 */       if (selectedColumn == 4) refreshRow();
/*  35: 35 */       if (selectedColumn == 5) deleteRow();
/*  36:    */     }
/*  37:    */     catch (ClassNotFoundException ex)
/*  38:    */     {
/*  39: 39 */       Logger.getLogger(TableClick.class.getName()).log(Level.SEVERE, null, ex);
/*  40:    */     } catch (SQLException ex) {
/*  41: 41 */       Logger.getLogger(TableClick.class.getName()).log(Level.SEVERE, null, ex);
/*  42:    */     } catch (IOException ex) {
/*  43: 43 */       Logger.getLogger(TableClick.class.getName()).log(Level.SEVERE, null, ex);
/*  44:    */     }
/*  45:    */   }
/*  46:    */   
/*  47:    */ 
/*  48:    */ 
/*  49:    */ 
/*  50:    */   public void refreshRow()
/*  51:    */     throws ClassNotFoundException, IOException
/*  52:    */   {
/*  53: 53 */     String notMatch = this.table.getValueAt(this.table.getSelectedRow(), 2).toString();
/*  54: 54 */     String description = this.table.getValueAt(this.table.getSelectedRow(), 3).toString();
/*  55:    */     
/*  56:    */ 
/*  57:    */ 
/*  58:    */ 
/*  59: 59 */     int notMatchMass = notMatch.charAt(0);
/*  60: 60 */     int descriptionMass = description.charAt(0);
/*  61:    */     
/*  62: 62 */     String english = null;
/*  63: 63 */     String russian = null;
/*  64:    */     
/*  65:    */ 
/*  66: 66 */     if (((notMatchMass >= 1040 ? 1 : 0) & (notMatchMass <= 1103 ? 1 : 0) | (notMatchMass == 1025 ? 1 : 0)) != 0) {
/*  67: 67 */       russian = notMatch;
/*  68: 68 */     } else if (((notMatchMass >= 65 ? 1 : 0) & (notMatchMass <= 122 ? 1 : 0)) != 0) {
/*  69: 69 */       english = notMatch;
/*  70:    */     }
/*  71:    */     
/*  72:    */ 
/*  73: 73 */     if (((descriptionMass >= 1040 ? 1 : 0) & (descriptionMass <= 1103 ? 1 : 0) | (descriptionMass == 1025 ? 1 : 0)) != 0) {
/*  74: 74 */       russian = description;
/*  75: 75 */     } else if (((descriptionMass >= 65 ? 1 : 0) & (descriptionMass <= 122 ? 1 : 0)) != 0) {
/*  76: 76 */       english = description;
/*  77:    */     }
/*  78:    */     
/*  79:    */ 
/*  80:    */ 
/*  81: 81 */     if (((english != null ? 1 : 0) & (russian != null ? 1 : 0)) != 0) {
/*  82: 82 */       String zapros = "update BASEDICTIONARY set ENGLISH = '" + english + "', RUSSIAN = '" + russian + "' where id = '" + getIDRow() + "'";
/*  83:    */       try {
/*  84: 84 */         new Query().insertToBase(zapros);
/*  85:    */       } catch (ClassNotFoundException ex) {
/*  86: 86 */         Logger.getLogger(AddNewWord.class.getName()).log(Level.SEVERE, null, ex);
/*  87:    */       } catch (SQLException ex) {
/*  88: 88 */         Logger.getLogger(AddNewWord.class.getName()).log(Level.SEVERE, null, ex);
/*  89:    */       }
/*  90:    */       
/*  91:    */       try
/*  92:    */       {
/*  93: 93 */         new Work().fillTable(SingletoneBasicFrame.getDictionaryFrame().jTableResult, SingletoneBasicFrame.getDictionaryFrame().jTextFieldWord.getText().toLowerCase(), SingletoneBasicFrame.getDictionaryFrame().jLabelMassage);
/*  94:    */       } catch (ClassNotFoundException ex) {
/*  95: 95 */         Logger.getLogger(AddNewWord.class.getName()).log(Level.SEVERE, null, ex);
/*  96:    */       } catch (SQLException ex) {
/*  97: 97 */         Logger.getLogger(AddNewWord.class.getName()).log(Level.SEVERE, null, ex);
/*  98:    */       }
/*  99:    */     }
/* 100:    */   }
/* 101:    */   
/* 102:    */ 
/* 103:    */ 
/* 104:    */ 
/* 105:    */ 
/* 106:    */ 
/* 107:    */ 
/* 108:    */ 
/* 109:    */ 
/* 110:    */ 
/* 111:    */ 
/* 112:    */ 
/* 113:    */ 
/* 114:    */ 
/* 115:    */   public void deleteRow()
/* 116:    */     throws ClassNotFoundException, SQLException, IOException
/* 117:    */   {
/* 118:118 */     String zapros = "delete from BASEDICTIONARY where id = '" + getIDRow() + "'";
/* 119:119 */     new Query().deleteToBase(zapros);
/* 120:    */     try
/* 121:    */     {
/* 122:122 */       new Work().fillTable(SingletoneBasicFrame.getDictionaryFrame().jTableResult, SingletoneBasicFrame.getDictionaryFrame().jTextFieldWord.getText().toLowerCase(), SingletoneBasicFrame.getDictionaryFrame().jLabelMassage);
/* 123:    */     } catch (ClassNotFoundException ex) {
/* 124:124 */       Logger.getLogger(DictionaryFrame.class.getName()).log(Level.SEVERE, null, ex);
/* 125:    */     } catch (SQLException ex) {
/* 126:126 */       Logger.getLogger(DictionaryFrame.class.getName()).log(Level.SEVERE, null, ex);
/* 127:    */     }
/* 128:    */   }
/* 129:    */   
/* 130:    */ 
/* 131:    */ 
/* 132:    */ 
/* 133:    */   private String getIDRow()
/* 134:    */   {
/* 135:135 */     return this.table.getValueAt(this.table.getSelectedRow(), 0).toString();
/* 136:    */   }
/* 137:    */ }


/* Location:           E:\dictionary\Dictionary.jar
 * Qualified Name:     dictionary.TableClick
 * JD-Core Version:    0.7.0.1
 */