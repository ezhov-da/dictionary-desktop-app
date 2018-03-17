package ru.ezhov.dictionary.dictionary;

import ru.ezhov.dictionary.publicClass.SingletoneServer;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


class ExitLabelMouseListeners
        extends MouseAdapter {
    public void mouseReleased(MouseEvent e) {
        try {
            SingletoneServer.getServer().stop();
        } catch (SQLException ex) {
            Logger.getLogger(ExitLabelMouseListeners.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.exit(0);
    }
}
