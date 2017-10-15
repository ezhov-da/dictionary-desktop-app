/*   1:    */ package ru.ezhov.dictionary.dictionary;
/*   2:    */ 
/*   3:    */ import ru.ezhov.dictionary.forma.DictionaryFrame;
/*   4:    */ import java.io.IOException;
/*   5:    */ import java.sql.SQLException;
/*   6:    */ import java.util.Vector;
/*   7:    */ import javax.swing.JButton;
/*   8:    */ import javax.swing.JLabel;
/*   9:    */ import javax.swing.JTable;
/*  10:    */ import javax.swing.table.DefaultTableModel;
/*  11:    */ import javax.swing.table.TableColumn;
/*  12:    */ import javax.swing.table.TableColumnModel;
/*  13:    */ import ru.ezhov.dictionary.publicClass.Query;
/*  14:    */ import ru.ezhov.dictionary.publicClass.SingletoneBasicFrame;
/*  15:    */ import ru.ezhov.dictionary.settings.MyTableCellRenderer;
/*  16:    */ import ru.ezhov.dictionary.settings.Setting;
/*  17:    */ 
/*  18:    */ 
/*  19:    */ 
/*  20:    */ 
/*  21:    */ 
/*  22:    */ 
/*  23:    */ 
/*  24:    */ public class Work
/*  25:    */ {
/*  26:    */   public void setSettingTable(JTable table)
/*  27:    */   {
/*  28: 28 */     new Setting().setSettingTable(table);
/*  29:    */   }
/*  30:    */   
/*  31:    */ 
/*  32:    */ 
/*  33:    */   public void fillTable(JTable table, String text, JLabel infoLabel)
/*  34:    */     throws ClassNotFoundException, SQLException, IOException
/*  35:    */   {
/*  36: 36 */     Query queryObject = new Query();
/*  37:    */     
/*  38:    */ 
/*  39:    */ 
/*  40:    */ 
/*  41: 41 */     if (text.equals("")) { text = "asdfasdfjhkhghfl";
/*  42:    */     }
/*  43:    */     
/*  44: 44 */     String zapros = "/*В данный запрос мы добавляем два столбца идентификатора(в конец)1. Обновить - r#$2. Удалить - d#$*/Select \nid,\nMATCH as \"...\",\nFIND,\nTRANSLATE, 'r#$' as r,'d#$' as d from (\n    select id,\n    case when trim(english) = '" + text + "' then 1 else 0 end as MATCH, \n" + "    english as FIND,\n" + "    russian  as TRANSLATE \n" + "from BASEDICTIONARY where LCase(english) like '%" + text + "%'\n" + "union all\n" + "    select id,\n" + "    case when (russian) = '" + text + "' then 1 else 0 end as MATCH, \n" + "    russian as FIND,\n" + "    english  as TRANSLATE  \n" + "    from BASEDICTIONARY where LCase(russian) like '%" + text + "%'\n" + ")order by MATCH desc,TRANSLATE";
/*  45:    */     
/*  46:    */ 
/*  47:    */ 
/*  48:    */ 
/*  49:    */ 
/*  50:    */ 
/*  51:    */ 
/*  52:    */ 
/*  53:    */ 
/*  54:    */ 
/*  55:    */ 
/*  56:    */ 
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
/*  68: 68 */     Object[] returnQueryObject = queryObject.selectTable(zapros);
/*  69: 69 */     Vector row = (Vector)returnQueryObject[0];
/*  70: 70 */     Vector columnHeads = (Vector)returnQueryObject[1];
/*  71:    */     
/*  72:    */ 
/*  73: 73 */     table.setModel(new DefaultTableModel(row, columnHeads));
/*  74: 74 */     table.setAutoCreateRowSorter(false);
/*  75:    */     
/*  76:    */ 
/*  77: 77 */     table.addMouseListener(new TableClick());
/*  78:    */     
/*  79:    */ 
/*  80:    */ 
/*  81: 81 */     if ((row.isEmpty() & !text.equals("asdfasdfjhkhghfl"))) {
/*  82: 82 */       infoLabel.setText("Найдено: " + row.size() + " совпадений. Может добавим слово? -->");
/*  83:    */       
/*  84: 84 */       SingletoneBasicFrame.getDictionaryFrame().jButtonAddNewWord.setVisible(true);
/*  85:    */     } else {
/*  86: 86 */       infoLabel.setText("Найдено: " + row.size() + " совпадений.");
/*  87:    */       
/*  88: 88 */       SingletoneBasicFrame.getDictionaryFrame().jButtonAddNewWord.setVisible(false);
/*  89:    */     }
/*  90:    */     
/*  91:    */ 
/*  92:    */ 
/*  93: 93 */     TableColumnModel tcm = table.getColumnModel();
/*  94:    */     
/*  95: 95 */     tcm.getColumn(1).setCellRenderer(new MyTableCellRenderer());
/*  96: 96 */     tcm.getColumn(4).setCellRenderer(new MyTableCellRenderer());
/*  97: 97 */     tcm.getColumn(5).setCellRenderer(new MyTableCellRenderer());
/*  98:    */     
/*  99:    */ 
/* 100:    */ 
/* 101:101 */     tcm.getColumn(1).setPreferredWidth(9);
/* 102:102 */     tcm.getColumn(1).setHeaderValue("*");
/* 103:    */     
/* 104:104 */     tcm.getColumn(2).setPreferredWidth(302);
/* 105:    */     
/* 106:106 */     tcm.getColumn(3).setPreferredWidth(302);
/* 107:    */     
/* 108:108 */     tcm.getColumn(4).setPreferredWidth(9);
/* 109:109 */     tcm.getColumn(5).setPreferredWidth(9);
/* 110:    */     
/* 111:    */ 
/* 112:112 */     tcm.getColumn(0).setPreferredWidth(0);
/* 113:113 */     tcm.getColumn(0).setPreferredWidth(0);
/* 114:114 */     tcm.getColumn(0).setMinWidth(0);
/* 115:115 */     tcm.getColumn(0).setMaxWidth(0);
/* 116:    */   }
/* 117:    */ }


/* Location:           E:\dictionary\Dictionary.jar
 * Qualified Name:     dictionary.Work
 * JD-Core Version:    0.7.0.1
 */