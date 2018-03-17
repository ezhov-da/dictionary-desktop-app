package ru.ezhov.dictionary.listeners;

import ru.ezhov.dictionary.publicClass.HideDictionaryFrame;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class ButtonAddNewWordKeyListeners
        extends KeyAdapter {
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == 27) new HideDictionaryFrame().hide();
    }
}



/* Location:           E:\dictionary\Dictionary.jar

 * Qualified Name:     Listeners.ButtonAddNewWordKeyListeners

 * JD-Core Version:    0.7.0.1

 */