/*  1:   */ package ru.ezhov.dictionary.settings;
/*  2:   */
/*  3:   */ import ru.ezhov.dictionary.App;
/*  4:   */ import java.awt.Component;
/*  5:   */ import java.awt.Toolkit;
/*  6:   */ import javax.swing.ImageIcon;
/*  7:   */ import javax.swing.JLabel;
/*  8:   */ import javax.swing.JTable;
/*  9:   */ import javax.swing.table.TableCellRenderer;
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
/* 23:   */ public class MyTableCellRenderer
/* 24:   */   extends JLabel
/* 25:   */   implements TableCellRenderer
/* 26:   */ {
/* 27:   */   public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
/* 28:   */   {
/* 29:29 */     setText((String)value);
/* 30:   */
/* 31:31 */     if (getText().equals("1")) {
/* 32:32 */       setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(App.class.getResource("/ru/ezhov/dictionary//pictures/redStar.png"))));
/* 33:33 */       setText("");
/* 34:34 */       setToolTipText("Полное совпадение");
/* 35:   */     }
/* 36:36 */     if (getText().equals("0")) {
/* 37:37 */       setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(App.class.getResource("/ru/ezhov/dictionary//pictures/whiteCircle.png"))));
/* 38:38 */       setText("");
/* 39:39 */       setToolTipText("Частичное совпадение");
/* 40:   */     }
/* 41:   */
/* 42:42 */     if (getText().equals("r#$")) {
/* 43:43 */       setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(App.class.getResource("/ru/ezhov/dictionary//pictures/refresh.png"))));
/* 44:44 */       setText("");
/* 45:45 */       setToolTipText("Обновить строку");
/* 46:   */     }
/* 47:   */
/* 48:48 */     if (getText().equals("d#$"))
/* 49:   */     {
/* 50:50 */       setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(App.class.getResource("/ru/ezhov/dictionary//pictures/delete.png"))));
/* 51:51 */       setText("");
/* 52:52 */       setToolTipText("Удалить строку");
/* 53:   */     }
/* 54:54 */     return this;
/* 55:   */   }
/* 56:   */ }



/* Location:           E:\dictionary\App.jar

 * Qualified Name:     settings.MyTableCellRenderer

 * JD-Core Version:    0.7.0.1

 */