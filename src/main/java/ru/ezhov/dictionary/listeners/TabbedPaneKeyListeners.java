/*  1:   */ package ru.ezhov.dictionary.listeners;
/*  2:   */ 
/*  3:   */ import java.awt.event.KeyAdapter;
/*  4:   */ import java.awt.event.KeyEvent;
/*  5:   */ import ru.ezhov.dictionary.publicClass.HideDictionaryFrame;
/*  6:   */ 
/*  7:   */ 
/*  8:   */ 
/*  9:   */ 
/* 10:   */ 
/* 11:   */ 
/* 12:   */ 
/* 13:   */ 
/* 14:   */ 
/* 15:   */ public class TabbedPaneKeyListeners
/* 16:   */   extends KeyAdapter
/* 17:   */ {
/* 18:   */   public void keyReleased(KeyEvent e)
/* 19:   */   {
/* 20:20 */     if (e.getKeyCode() == 27) new HideDictionaryFrame().hide();
/* 21:   */   }
/* 22:   */ }



/* Location:           E:\dictionary\Dictionary.jar

 * Qualified Name:     Listeners.TabbedPaneKeyListeners

 * JD-Core Version:    0.7.0.1

 */