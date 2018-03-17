package ru.ezhov.dictionary.publicClass;

import com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel;

import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MyLookAndFeel {
    public void setMyLookAndFeel() {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            try {
                UIManager.setLookAndFeel(new MetalLookAndFeel());
            } catch (UnsupportedLookAndFeelException ex1) {
                Logger.getLogger(MyLookAndFeel.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }
}