/*  1:   */ package ru.ezhov.dictionary.dictionary;
/*  2:   */ 
/*  3:   */ import java.awt.event.MouseAdapter;
/*  4:   */ import java.awt.event.MouseEvent;
/*  5:   */ import java.sql.SQLException;
/*  6:   */ import java.util.logging.Level;
/*  7:   */ import java.util.logging.Logger;
/*  8:   */ import org.h2.tools.Server;
/*  9:   */ import ru.ezhov.dictionary.publicClass.SingletoneServer;
/* 10:   */ 
/* 11:   */ 
/* 12:   */ 
/* 13:   */ 
/* 14:   */ 
/* 15:   */ 
/* 16:   */ 
/* 17:   */ 
/* 18:   */ 
/* 19:   */ 
/* 20:   */ 
/* 21:   */ 
/* 22:   */ 
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
/* 45:   */ class ExitLabelMouseListeners
/* 46:   */   extends MouseAdapter
/* 47:   */ {
/* 48:   */   public void mouseReleased(MouseEvent e)
/* 49:   */   {
/* 50:   */     try
/* 51:   */     {
/* 52:52 */       SingletoneServer.getServer().stop();
/* 53:   */     } catch (SQLException ex) {
/* 54:54 */       Logger.getLogger(ExitLabelMouseListeners.class.getName()).log(Level.SEVERE, null, ex);
/* 55:   */     }
/* 56:56 */     System.exit(0);
/* 57:   */   }
/* 58:   */ }



/* Location:           E:\dictionary\Dictionary.jar

 * Qualified Name:     dictionary.ExitLabelMouseListeners

 * JD-Core Version:    0.7.0.1

 */