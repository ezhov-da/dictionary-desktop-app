package ru.ezhov.dictionary.dictionary;

import javax.swing.*;


public class MyPopupMenu
        extends JPopupMenu {
    int X;
    int Y;

    public MyPopupMenu(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }

    public void run() {
        JPopupMenu popupm = new JPopupMenu();

        JLabel labelExit = new JLabel("Выход");

        labelExit.addMouseListener(new ExitLabelMouseListeners());

        popupm.add(labelExit);
        popupm.show(null, this.X - 50, this.Y - 35);
    }
}