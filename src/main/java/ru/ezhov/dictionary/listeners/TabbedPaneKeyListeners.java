package ru.ezhov.dictionary.listeners;

import ru.ezhov.dictionary.publicClass.HideDictionaryFrame;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class TabbedPaneKeyListeners
        extends KeyAdapter {
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == 27) new HideDictionaryFrame().hide();
    }
}