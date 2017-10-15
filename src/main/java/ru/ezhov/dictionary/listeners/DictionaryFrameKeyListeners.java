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
/* 15:   */ 
/* 16:   */ public class DictionaryFrameKeyListeners
/* 17:   */   extends KeyAdapter
/* 18:   */ {
/* 19:   */   public void keyReleased(KeyEvent e)
/* 20:   */   {
/* 21:21 */     if (e.getKeyCode() == 27) new HideDictionaryFrame().hide();
/* 22:   */   }
/* 23:   */ }



/* Location:           E:\dictionary\App.jar

 * Qualified Name:     Listeners.DictionaryFrameKeyListeners

 * JD-Core Version:    0.7.0.1

 */