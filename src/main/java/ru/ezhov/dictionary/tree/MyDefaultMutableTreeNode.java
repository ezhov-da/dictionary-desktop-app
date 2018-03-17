package ru.ezhov.dictionary.tree;

import javax.swing.tree.DefaultMutableTreeNode;
import java.util.ArrayList;


class MyDefaultMutableTreeNode {
    private final ArrayList<MyTreeObject> list;
    private final String nameBasicRoot;

    public MyDefaultMutableTreeNode(ArrayList<MyTreeObject> list, String nameBasicRoot) {
        this.list = list;
        this.nameBasicRoot = nameBasicRoot;
    }

    public DefaultMutableTreeNode createTree() {
        DefaultMutableTreeNode dmtn = new DefaultMutableTreeNode(this.nameBasicRoot);
        DefaultMutableTreeNode dmtnLVL0 = null;
        DefaultMutableTreeNode dmtnLVL1 = null;
        for (MyTreeObject mto : this.list) {
            switch (mto.getLvl()) {
                case 0:
                    dmtnLVL0 = new DefaultMutableTreeNode(mto);
                    dmtn.add(dmtnLVL0);
                    break;
                case 1:
                    dmtnLVL1 = new DefaultMutableTreeNode(mto);
                    dmtnLVL0.add(dmtnLVL1);
            }

        }
        return dmtn;
    }
}