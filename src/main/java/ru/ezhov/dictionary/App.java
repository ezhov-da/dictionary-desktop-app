package ru.ezhov.dictionary;

import org.h2.tools.Server;
import ru.ezhov.dictionary.dictionary.SettingsLeaf;
import ru.ezhov.dictionary.listeners.TrayMouseListeners;
import ru.ezhov.dictionary.publicClass.DefaultSettings;
import ru.ezhov.dictionary.publicClass.MyLookAndFeel;
import ru.ezhov.dictionary.publicClass.SingletoneBasicFrame;
import ru.ezhov.dictionary.publicClass.SingletoneServer;
import ru.ezhov.dictionary.tree.WorkWithTree;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class App {
    public static void main(String[] args) {
        try {
            new MyLookAndFeel().setMyLookAndFeel();
            Server server = SingletoneServer.getServer();
            server.start();
            new DefaultSettings().setDefault();
            new WorkWithTree().run();
            new SettingsLeaf().setSettings();
            SingletoneBasicFrame.getDictionaryFrame().jButtonAddNewWord.setVisible(false);
            if (!SystemTray.isSupported()) {
                JOptionPane.showMessageDialog(null,
                        "Система не поддерживает системный трей",
                        "Внимание!",
                        1);
            }
            SystemTray st = SystemTray.getSystemTray();
            Image image = ImageIO.read(App.class.getResource("/ru/ezhov/dictionary/pictures/dictionary.png"));
            TrayIcon ti = new TrayIcon(image, "Переводчик");
            ti.addMouseListener(new TrayMouseListeners(ti));
            ti.isImageAutoSize();
            st.add(ti);
        } catch (Exception ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.exit(-10);
        }
    }
}
