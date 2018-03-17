package ru.ezhov.dictionary.tree;

import ru.ezhov.dictionary.App;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellRenderer;
import java.awt.*;


public class MyTreeCellRender
        extends JLabel
        implements TreeCellRenderer {
    public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus) {
        DefaultMutableTreeNode myObject = (DefaultMutableTreeNode) value;
        setText(myObject.toString());

        if ((!leaf) && (expanded)) {
            setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(App.class.getResource("/ru/ezhov/dictionary/pictures/fortree/folderOpen.png"))));
        }
        if ((!leaf) && (!expanded)) {
            setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(App.class.getResource("/ru/ezhov/dictionary/pictures/fortree/folderClose.png"))));
        }
        if (leaf) {
            setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(App.class.getResource("/ru/ezhov/dictionary/pictures/fortree/node.png"))));
        }
        return this;
    }
}