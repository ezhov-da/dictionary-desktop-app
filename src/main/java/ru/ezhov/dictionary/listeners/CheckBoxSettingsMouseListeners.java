/*  1:   */ package ru.ezhov.dictionary.listeners;
/*  2:   */ 
/*  3:   */ import ru.ezhov.dictionary.dictionary.SettingsLeaf;
/*  4:   */ import java.awt.event.MouseAdapter;
/*  5:   */ import java.awt.event.MouseEvent;
/*  6:   */ import java.io.IOException;
/*  7:   */ import java.util.logging.Level;
/*  8:   */ import java.util.logging.Logger;
/*  9:   */ 
/* 10:   */ 
/* 11:   */ 
/* 12:   */ 
/* 13:   */ 
/* 14:   */ 
/* 15:   */ 
/* 16:   */ 
/* 17:   */ public class CheckBoxSettingsMouseListeners
/* 18:   */   extends MouseAdapter
/* 19:   */ {
/* 20:   */   public void mouseClicked(MouseEvent e)
/* 21:   */   {
/* 22:   */     try
/* 23:   */     {
/* 24:24 */       new SettingsLeaf().setNewSettings();
/* 25:   */     } catch (IOException ex) {
/* 26:26 */       Logger.getLogger(CheckBoxSettingsMouseListeners.class.getName()).log(Level.SEVERE, null, ex);
/* 27:   */     }
/* 28:   */   }
/* 29:   */ }



/* Location:           E:\dictionary\Dictionary.jar

 * Qualified Name:     Listeners.CheckBoxSettingsMouseListeners

 * JD-Core Version:    0.7.0.1

 */