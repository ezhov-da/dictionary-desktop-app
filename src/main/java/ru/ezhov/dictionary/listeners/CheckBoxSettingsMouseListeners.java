package ru.ezhov.dictionary.listeners;

import ru.ezhov.dictionary.dictionary.SettingsLeaf;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CheckBoxSettingsMouseListeners
        extends MouseAdapter {
    public void mouseClicked(MouseEvent e) {
        try {
            new SettingsLeaf().setNewSettings();
        } catch (IOException ex) {
            Logger.getLogger(CheckBoxSettingsMouseListeners.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}