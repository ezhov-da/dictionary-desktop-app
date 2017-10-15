/*  1:   */ package ru.ezhov.dictionary.publicClass;
/*  2:   */ 
/*  3:   */ import java.sql.SQLException;
/*  4:   */ import org.h2.tools.Server;
/*  5:   */ 
/*  6:   */ 
/*  7:   */ 
/*  8:   */ 
/*  9:   */ 
/* 10:   */ 
/* 11:   */ 
/* 12:   */ 
/* 13:   */ 
/* 14:   */ 
/* 15:   */ public class SingletoneServer
/* 16:   */ {
/* 17:17 */   private static Server server = null;
/* 18:18 */   private static String serverPort = null;
/* 19:   */   
/* 20:   */ 
/* 21:   */   public static Server getServer()
/* 22:   */     throws SQLException
/* 23:   */   {
/* 24:24 */     if (server == null) {
/* 25:25 */       server = Server.createTcpServer(new String[] { "-tcp" });
/* 26:26 */       serverPort = server.getURL();
/* 27:   */     }
/* 28:28 */     return server;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public static String getServerPort()
/* 32:   */   {
/* 33:33 */     return serverPort;
/* 34:   */   }
/* 35:   */ }


/* Location:           E:\dictionary\App.jar
 * Qualified Name:     publicClass.SingletoneServer
 * JD-Core Version:    0.7.0.1
 */