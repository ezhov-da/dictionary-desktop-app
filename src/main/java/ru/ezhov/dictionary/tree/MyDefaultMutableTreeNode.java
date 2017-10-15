/*   1:    */ package ru.ezhov.dictionary.tree;
/*   2:    */ 
/*   3:    */ import java.util.ArrayList;
/*   4:    */ import javax.swing.tree.DefaultMutableTreeNode;
/*   5:    */ 
/*   6:    */ 
/*   7:    */ 
/*   8:    */ 
/*   9:    */ 
/*  10:    */ 
/*  11:    */ 
/*  12:    */ 
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
/*  28:    */ 
/*  29:    */ 
/*  30:    */ 
/*  31:    */ 
/*  32:    */ 
/*  33:    */ 
/*  34:    */ 
/*  35:    */ 
/*  36:    */ 
/*  37:    */ 
/*  38:    */ 
/*  39:    */ 
/*  40:    */ 
/*  41:    */ 
/*  42:    */ 
/*  43:    */ 
/*  44:    */ 
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
/*  68:    */ 
/*  69:    */ 
/*  70:    */ 
/*  71:    */ 
/*  72:    */ 
/*  73:    */ 
/*  74:    */ 
/*  75:    */ 
/*  76:    */ 
/*  77:    */ 
/*  78:    */ 
/*  79:    */ 
/*  80:    */ 
/*  81:    */ 
/*  82:    */ 
/*  83:    */ 
/*  84:    */ 
/*  85:    */ 
/*  86:    */ 
/*  87:    */ 
/*  88:    */ 
/*  89:    */ 
/*  90:    */ 
/*  91:    */ 
/*  92:    */ 
/*  93:    */ 
/*  94:    */ 
/*  95:    */ class MyDefaultMutableTreeNode
/*  96:    */ {
/*  97:    */   private final ArrayList<MyTreeObject> list;
/*  98:    */   private final String nameBasicRoot;
/*  99:    */   
/* 100:    */   public MyDefaultMutableTreeNode(ArrayList<MyTreeObject> list, String nameBasicRoot)
/* 101:    */   {
/* 102:102 */     this.list = list;
/* 103:103 */     this.nameBasicRoot = nameBasicRoot;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public DefaultMutableTreeNode createTree()
/* 107:    */   {
/* 108:108 */     DefaultMutableTreeNode dmtn = new DefaultMutableTreeNode(this.nameBasicRoot);
/* 109:109 */     DefaultMutableTreeNode dmtnLVL0 = null;
/* 110:110 */     DefaultMutableTreeNode dmtnLVL1 = null;
/* 111:111 */     for (MyTreeObject mto : this.list) {
/* 112:112 */       switch (mto.getLvl()) {
/* 113:    */       case 0: 
/* 114:114 */         dmtnLVL0 = new DefaultMutableTreeNode(mto);
/* 115:115 */         dmtn.add(dmtnLVL0);
/* 116:116 */         break;
/* 117:    */       case 1: 
/* 118:118 */         dmtnLVL1 = new DefaultMutableTreeNode(mto);
/* 119:119 */         dmtnLVL0.add(dmtnLVL1);
/* 120:    */       }
/* 121:    */       
/* 122:    */     }
/* 123:123 */     return dmtn;
/* 124:    */   }
/* 125:    */ }



/* Location:           E:\dictionary\Dictionary.jar

 * Qualified Name:     Tree.MyDefaultMutableTreeNode

 * JD-Core Version:    0.7.0.1

 */