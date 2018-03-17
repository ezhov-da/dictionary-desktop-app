package ru.ezhov.dictionary.listeners;

import ru.ezhov.dictionary.App;
import ru.ezhov.dictionary.dictionary.AddNewWord;
import ru.ezhov.dictionary.dictionary.MyPopupMenu;
import ru.ezhov.dictionary.dictionary.Work;
import ru.ezhov.dictionary.publicClass.SingletoneBasicFrame;
import ru.ezhov.dictionary.settings.Setting;
import ru.ezhov.dictionary.util.LocatedComponent;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TrayMouseListeners extends MouseAdapter {
    TrayIcon ti;

    public TrayMouseListeners(TrayIcon ti) {
        this.ti = ti;
    }

    public void mouseReleased(MouseEvent e) {
        if (e.getButton() == 1) {

            SingletoneBasicFrame.getDictionaryFrame().jButtonAddNewWord.addMouseListener(new AddNewWord());
            SingletoneBasicFrame.getDictionaryFrame().jCheckBoxSettings.addMouseListener(new CheckBoxSettingsMouseListeners());
            SingletoneBasicFrame.getDictionaryFrame().jCheckBoxSettings.addKeyListener(new CheckBoxSettingsKeyListeners());
            SingletoneBasicFrame.getDictionaryFrame().jTextFieldPathToBase.addKeyListener(new FieldPathToBaseKeyListeners());
            SingletoneBasicFrame.getDictionaryFrame().jTextFieldPathToURL.addKeyListener(new FieldPathToURLKeyListeners());
            try {
                SingletoneBasicFrame.getDictionaryFrame().setIconImage(ImageIO.read(App.class.getResource("/ru/ezhov/dictionary/pictures/openDictionary.png")));

                this.ti.setImage(ImageIO.read(App.class.getResource("/ru/ezhov/dictionary/pictures/openDictionary.png")));
            } catch (IOException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
            Work work = new Work();
            work.setSettingTable(SingletoneBasicFrame.getDictionaryFrame().jTableResult);
            SingletoneBasicFrame.getDictionaryFrame().setLocation(e.getX() - SingletoneBasicFrame.getDictionaryFrame().getWidth() - 10, e.getY() - SingletoneBasicFrame.getDictionaryFrame().getHeight() - 10);
            SingletoneBasicFrame.getDictionaryFrame().addWindowListener(new WindowAdapter() {
                public void windowDeactivated(WindowEvent e) {
                    try {
                        TrayMouseListeners.this.ti.setImage(ImageIO.read(App.class.getResource("/ru/ezhov/dictionary/pictures/dictionary.png")));
                    } catch (IOException ex) {
                        Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);

                    }

                }

            });
            SingletoneBasicFrame.getDictionaryFrame().addKeyListener(new DictionaryFrameKeyListeners());
            SingletoneBasicFrame.getDictionaryFrame().jButtonClear.addKeyListener(new ButtonClearKeyListeners());
            SingletoneBasicFrame.getDictionaryFrame().jTableResult.addKeyListener(new TableResultKeyListeners());
            SingletoneBasicFrame.getDictionaryFrame().jButtonAddNewWord.addKeyListener(new ButtonAddNewWordKeyListeners());
            SingletoneBasicFrame.getDictionaryFrame().jTreeBase.addKeyListener(new TreeBaseKeyListeners());
            SingletoneBasicFrame.getDictionaryFrame().jTabbedPane.addKeyListener(new TabbedPaneKeyListeners());
            Setting set = new Setting();

            set.setSettingLabelInformation(SingletoneBasicFrame.getDictionaryFrame().jLabelMassage);
            set.setSettingButtonClear(SingletoneBasicFrame.getDictionaryFrame().jButtonClear);
            set.setSettingButtonAddNewWord(SingletoneBasicFrame.getDictionaryFrame().jButtonAddNewWord);

            SingletoneBasicFrame.getDictionaryFrame().setVisible(true);
            SingletoneBasicFrame.getDictionaryFrame().setAlwaysOnTop(true);
            LocatedComponent.locatedInTheCorner(SingletoneBasicFrame.getDictionaryFrame());

        } else if (e.getButton() == 3) {
            new MyPopupMenu(e.getX(), e.getY()).run();
        }
    }
}
