/*  1:   */ package ru.ezhov.dictionary.dictionary;
/*  2:   */ 
/*  3:   */ import javax.swing.JLabel;
/*  4:   */ import javax.swing.JPopupMenu;
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
/* 15:   */ 
/* 16:   */ 
/* 17:   */ 
/* 18:   */ 
/* 19:   */ public class MyPopupMenu
/* 20:   */   extends JPopupMenu
/* 21:   */ {
/* 22:   */   int X;
/* 23:   */   int Y;
/* 24:   */   
/* 25:   */   public MyPopupMenu(int X, int Y)
/* 26:   */   {
/* 27:27 */     this.X = X;
/* 28:28 */     this.Y = Y;
/* 29:   */   }
/* 30:   */   
/* 31:   */ 
/* 32:   */   public void run()
/* 33:   */   {
/* 34:34 */     JPopupMenu popupm = new JPopupMenu();
/* 35:   */     
/* 36:36 */     JLabel labelExit = new JLabel("Выход");
/* 37:   */     
/* 38:38 */     labelExit.addMouseListener(new ExitLabelMouseListeners());
/* 39:   */     
/* 40:40 */     popupm.add(labelExit);
/* 41:41 */     popupm.show(null, this.X - 50, this.Y - 35);
/* 42:   */   }
/* 43:   */ }


/* Location:           E:\dictionary\Dictionary.jar
 * Qualified Name:     dictionary.MyPopupMenu
 * JD-Core Version:    0.7.0.1
 */