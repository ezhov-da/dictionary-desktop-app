/*  1:   */ package ru.ezhov.dictionary.tree;
/*  2:   */ 
/*  3:   */ import ru.ezhov.dictionary.forma.DictionaryFrame;
/*  4:   */ import java.io.IOException;
/*  5:   */ import java.sql.SQLException;
/*  6:   */ import java.util.ArrayList;
/*  7:   */ import javax.swing.JTree;
/*  8:   */ import javax.swing.tree.DefaultTreeModel;
/*  9:   */ import ru.ezhov.dictionary.publicClass.Query;
/* 10:   */ import ru.ezhov.dictionary.publicClass.SingletoneBasicFrame;
/* 11:   */ 
/* 12:   */ 
/* 13:   */ 
/* 14:   */ 
/* 15:   */ 
/* 16:   */ 
/* 17:   */ 
/* 18:   */ 
/* 19:   */ 
/* 20:   */ public class WorkWithTree
/* 21:   */ {
/* 22:22 */   private final String queryS = "select \ndistinct\nt1.id,\ncase when t1.lvl = 0 then  UPPER(t1.One) else lower(t1.One) end as One,\nt1.lvl,\nt1.little\nfrom\n(\n        select \n        t1.id,\n        t1.One,\n        t1.lvl,\n        t1.little\n        from (\n                select \n                distinct \n                5000000 as id,\n                lower(left(ENGLISH,1)) as One,\n                0 as lvl,\n                lower(left(ENGLISH,1)) as little\n                from BASEDICTIONARY\n                union all\n                select \n                id,\n                lower(ENGLISH || ' - ' || RUSSIAN) as One,\n                1 as lvl,\n                lower(ENGLISH || ' - ' || RUSSIAN) as little \n                from BASEDICTIONARY\n        ) t1 \n\n        union all\n\n        select \n        t1.id,\n        t1.One,\n        t1.lvl,\n        t1.little\n        from (\n                select \n                distinct \n                5000000 as id,\n                lower(left(RUSSIAN,1)) as One,\n                0 as lvl,\n                lower(left(RUSSIAN,1)) as little\n                from BASEDICTIONARY\n                union all\n                select \n                id,\n                lower(RUSSIAN || ' - ' || ENGLISH) as One,\n                1 as lvl,\n                lower(RUSSIAN || ' - ' || ENGLISH) as little \n                from BASEDICTIONARY\n        ) t1 \n) t1 order by t1.little\n";
/* 23:   */   
/* 24:   */ 
/* 25:   */ 
/* 26:   */ 
/* 27:   */ 
/* 28:   */ 
/* 29:   */ 
/* 30:   */ 
/* 31:   */ 
/* 32:   */ 
/* 33:   */ 
/* 34:   */ 
/* 35:   */ 
/* 36:   */ 
/* 37:   */ 
/* 38:   */ 
/* 39:   */ 
/* 40:   */ 
/* 41:   */ 
/* 42:   */ 
/* 43:   */ 
/* 44:   */ 
/* 45:   */ 
/* 46:   */ 
/* 47:   */ 
/* 48:   */ 
/* 49:   */ 
/* 50:   */ 
/* 51:   */ 
/* 52:   */ 
/* 53:   */ 
/* 54:   */ 
/* 55:   */ 
/* 56:   */ 
/* 57:   */ 
/* 58:   */ 
/* 59:   */ 
/* 60:   */ 
/* 61:   */ 
/* 62:   */ 
/* 63:   */ 
/* 64:   */ 
/* 65:   */ 
/* 66:   */ 
/* 67:   */ 
/* 68:   */ 
/* 69:   */ 
/* 70:   */ 
/* 71:   */ 
/* 72:   */ 
/* 73:   */ 
/* 74:   */ 
/* 75:   */ 
/* 76:   */   public void run()
/* 77:   */     throws SQLException, ClassNotFoundException, IOException
/* 78:   */   {
/* 79:79 */     Query query = new Query();
/* 80:80 */     ArrayList<MyTreeObject> list = query.treeList("select \ndistinct\nt1.id,\ncase when t1.lvl = 0 then  UPPER(t1.One) else lower(t1.One) end as One,\nt1.lvl,\nt1.little\nfrom\n(\n        select \n        t1.id,\n        t1.One,\n        t1.lvl,\n        t1.little\n        from (\n                select \n                distinct \n                5000000 as id,\n                lower(left(ENGLISH,1)) as One,\n                0 as lvl,\n                lower(left(ENGLISH,1)) as little\n                from BASEDICTIONARY\n                union all\n                select \n                id,\n                lower(ENGLISH || ' - ' || RUSSIAN) as One,\n                1 as lvl,\n                lower(ENGLISH || ' - ' || RUSSIAN) as little \n                from BASEDICTIONARY\n        ) t1 \n\n        union all\n\n        select \n        t1.id,\n        t1.One,\n        t1.lvl,\n        t1.little\n        from (\n                select \n                distinct \n                5000000 as id,\n                lower(left(RUSSIAN,1)) as One,\n                0 as lvl,\n                lower(left(RUSSIAN,1)) as little\n                from BASEDICTIONARY\n                union all\n                select \n                id,\n                lower(RUSSIAN || ' - ' || ENGLISH) as One,\n                1 as lvl,\n                lower(RUSSIAN || ' - ' || ENGLISH) as little \n                from BASEDICTIONARY\n        ) t1 \n) t1 order by t1.little\n");
/* 81:   */     
/* 82:   */ 
/* 83:   */ 
/* 84:84 */     MyDefaultMutableTreeNode mmtn = new MyDefaultMutableTreeNode(list, "Словарь");
/* 85:85 */     DefaultTreeModel dtm = new DefaultTreeModel(mmtn.createTree());
/* 86:   */     
/* 87:87 */     SingletoneBasicFrame.getDictionaryFrame().jTreeBase.setModel(dtm);
/* 88:88 */     SingletoneBasicFrame.getDictionaryFrame().jTreeBase.setCellRenderer(new MyTreeCellRender());
/* 89:   */   }
/* 90:   */ }



/* Location:           E:\dictionary\Dictionary.jar

 * Qualified Name:     Tree.WorkWithTree

 * JD-Core Version:    0.7.0.1

 */