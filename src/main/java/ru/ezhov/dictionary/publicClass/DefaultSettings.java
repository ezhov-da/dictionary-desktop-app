/*  1:   */ package ru.ezhov.dictionary.publicClass;
/*  2:   */ 
/*  3:   */ import java.io.IOException;
/*  4:   */ 
/*  5:   */ 
/*  6:   */ 
/*  7:   */ 
/*  8:   */ 
/*  9:   */ 
/* 10:   */ 
/* 11:   */ 
/* 12:   */ 
/* 13:   */ public class DefaultSettings
/* 14:   */ {
/* 15:   */   public void setDefault()
/* 16:   */     throws IOException
/* 17:   */   {
/* 18:18 */     MyProperties.setProperties("defailtPathBase", MyProperties.dirPath() + "\\basedictionary\\basedictionary");
/* 19:19 */     MyProperties.setProperties("defaultPort", SingletoneServer.getServerPort());
/* 20:   */   }
/* 21:   */ }


/* Location:           E:\dictionary\Dictionary.jar
 * Qualified Name:     publicClass.DefaultSettings
 * JD-Core Version:    0.7.0.1
 */