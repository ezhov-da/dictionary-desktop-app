/*  1:   */ package ru.ezhov.dictionary.publicClass;
/*  2:   */ 
/*  3:   */ import com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel;
/*  4:   */ import java.util.logging.Level;
/*  5:   */ import java.util.logging.Logger;
/*  6:   */ import javax.swing.UIManager;
/*  7:   */ import javax.swing.UnsupportedLookAndFeelException;
/*  8:   */ import javax.swing.plaf.metal.MetalLookAndFeel;
/*  9:   */ 
/* 10:   */ 
/* 11:   */ 
/* 12:   */ 
/* 13:   */ 
/* 14:   */ 
/* 15:   */ 
/* 16:   */ 
/* 17:   */ public class MyLookAndFeel
/* 18:   */ {
/* 19:   */   public void setMyLookAndFeel()
/* 20:   */   {
/* 21:   */     try
/* 22:   */     {
/* 23:23 */       UIManager.setLookAndFeel(new NimbusLookAndFeel());
/* 24:   */     } catch (UnsupportedLookAndFeelException ex) {
/* 25:   */       try {
/* 26:26 */         UIManager.setLookAndFeel(new MetalLookAndFeel());
/* 27:   */       } catch (UnsupportedLookAndFeelException ex1) {
/* 28:28 */         Logger.getLogger(MyLookAndFeel.class.getName()).log(Level.SEVERE, null, ex1);
/* 29:   */       }
/* 30:   */     }
/* 31:   */   }
/* 32:   */ }


/* Location:           E:\dictionary\Dictionary.jar
 * Qualified Name:     publicClass.MyLookAndFeel
 * JD-Core Version:    0.7.0.1
 */