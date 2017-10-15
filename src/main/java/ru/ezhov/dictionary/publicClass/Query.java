/*   1:    */ package ru.ezhov.dictionary.publicClass;
/*   2:    */ 
/*   3:    */ import ru.ezhov.dictionary.tree.MyTreeObject;
/*   4:    */ import ru.ezhov.dictionary.connect.ConnectToBase;
/*   5:    */ import java.io.IOException;
/*   6:    */ import java.sql.Connection;
/*   7:    */ import java.sql.ResultSet;
/*   8:    */ import java.sql.ResultSetMetaData;
/*   9:    */ import java.sql.SQLException;
/*  10:    */ import java.sql.Statement;
/*  11:    */ import java.util.ArrayList;
/*  12:    */ import java.util.Vector;
/*  13:    */ 
/*  14:    */ 
/*  15:    */ 
/*  16:    */ 
/*  17:    */ 
/*  18:    */ 
/*  19:    */ 
/*  20:    */ 
/*  21:    */ 
/*  22:    */ 
/*  23:    */ 
/*  24:    */ 
/*  25:    */ 
/*  26:    */ 
/*  27:    */ 
/*  28:    */ public class Query
/*  29:    */ {
/*  30:    */   public Object[] selectTable(String zapros)
/*  31:    */     throws ClassNotFoundException, SQLException, IOException
/*  32:    */   {
/*  33: 33 */     Statement st = ConnectToBase.getConnect().createStatement();
/*  34: 34 */     ResultSet rs = st.executeQuery(zapros);
/*  35: 35 */     ResultSetMetaData rsmd = rs.getMetaData();
/*  36:    */     
/*  37:    */ 
/*  38: 38 */     Vector<String> columnName = new Vector();
/*  39:    */     
/*  40: 40 */     for (int i = 1; i <= rsmd.getColumnCount(); i++) {
/*  41: 41 */       columnName.add(rsmd.getColumnName(i));
/*  42:    */     }
/*  43:    */     
/*  44:    */ 
/*  45: 45 */     Vector<Vector<String>> VECTOR = new Vector();
/*  46:    */     
/*  47:    */ 
/*  48: 48 */     while (rs.next()) {
/*  49: 49 */       Vector<String> row = new Vector();
/*  50:    */       
/*  51: 51 */       for (String str : columnName) {
/*  52: 52 */         row.add(rs.getString(str));
/*  53:    */       }
/*  54: 54 */       VECTOR.add(row);
/*  55:    */     }
/*  56:    */     
/*  57: 57 */     st.close();
/*  58:    */     
/*  59:    */ 
/*  60:    */ 
/*  61:    */ 
/*  62: 62 */     Object[] itogMass = { VECTOR, columnName };
/*  63:    */     
/*  64: 64 */     return itogMass;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public void insertToBase(String zapros) throws ClassNotFoundException, SQLException, ClassNotFoundException, IOException {
/*  68: 68 */     Statement st = ConnectToBase.getConnect().createStatement();
/*  69: 69 */     st.execute(zapros);
/*  70: 70 */     st.close();
/*  71:    */   }
/*  72:    */   
/*  73:    */   public void deleteToBase(String zapros) throws ClassNotFoundException, SQLException, ClassNotFoundException, IOException {
/*  74: 74 */     Statement st = ConnectToBase.getConnect().createStatement();
/*  75: 75 */     st.execute(zapros);
/*  76: 76 */     st.close();
/*  77:    */   }
/*  78:    */   
/*  79:    */ 
/*  80:    */ 
/*  81:    */ 
/*  82:    */   public ArrayList<MyTreeObject> treeList(String query)
/*  83:    */     throws SQLException, ClassNotFoundException, IOException
/*  84:    */   {
/*  85: 85 */     Statement st = ConnectToBase.getConnect().createStatement();
/*  86: 86 */     ResultSet rs = st.executeQuery(query);
/*  87: 87 */     ArrayList<MyTreeObject> list = new ArrayList();
/*  88:    */     
/*  89: 89 */     while (rs.next()) {
/*  90: 90 */       MyTreeObject myObject = new MyTreeObject();
/*  91: 91 */       myObject.setId(rs.getInt("id"));
/*  92: 92 */       myObject.setOne(rs.getString("One"));
/*  93: 93 */       myObject.setLvl(rs.getInt("lvl"));
/*  94: 94 */       myObject.setLittle(rs.getString("little"));
/*  95: 95 */       list.add(myObject);
/*  96:    */     }
/*  97:    */     
/*  98:    */ 
/*  99: 99 */     st.close();
/* 100:    */     
/* 101:101 */     return list;
/* 102:    */   }
/* 103:    */ }


/* Location:           E:\dictionary\Dictionary.jar
 * Qualified Name:     publicClass.Query
 * JD-Core Version:    0.7.0.1
 */