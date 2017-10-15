/*  1:   */ package ru.ezhov.dictionary.tree;
/*  2:   */
/*  3:   */ import ru.ezhov.dictionary.App;
/*  4:   */ import java.awt.Component;
/*  5:   */ import java.awt.Toolkit;
/*  6:   */ import javax.swing.ImageIcon;
/*  7:   */ import javax.swing.JLabel;
/*  8:   */ import javax.swing.JTree;
/*  9:   */ import javax.swing.tree.DefaultMutableTreeNode;
/* 10:   */ import javax.swing.tree.TreeCellRenderer;
/* 11:   */
/* 12:   */
/* 13:   */
/* 14:   */
/* 15:   */
/* 16:   */ public class MyTreeCellRender
/* 17:   */   extends JLabel
/* 18:   */   implements TreeCellRenderer
/* 19:   */ {
/* 20:   */   public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus)
/* 21:   */   {
/* 22:22 */     DefaultMutableTreeNode myObject = (DefaultMutableTreeNode)value;
/* 23:23 */     setText(myObject.toString());
/* 24:   */
/* 25:   */
/* 26:   */
/* 27:   */
/* 28:28 */     if ((!leaf) && (expanded)) { setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(App.class.getResource("/ru/ezhov/dictionary/pictures/fortree/folderOpen.png"))));
/* 29:   */     }
/* 30:30 */     if ((!leaf) && (!expanded)) { setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(App.class.getResource("/ru/ezhov/dictionary/pictures/fortree/folderClose.png"))));
/* 31:   */     }
/* 32:32 */     if (leaf) { setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(App.class.getResource("/ru/ezhov/dictionary/pictures/fortree/node.png"))));
/* 33:   */     }
/* 34:34 */     return this;
/* 35:   */   }
/* 36:   */ }



/* Location:           E:\dictionary\App.jar

 * Qualified Name:     Tree.MyTreeCellRender

 * JD-Core Version:    0.7.0.1

 */