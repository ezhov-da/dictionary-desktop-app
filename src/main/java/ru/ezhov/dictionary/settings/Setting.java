package ru.ezhov.dictionary.settings;

import ru.ezhov.dictionary.App;

import javax.swing.*;
import java.awt.*;

public class Setting {
    public void setSettingTable(JTable table) {
        table.setShowHorizontalLines(false);
        table.setShowVerticalLines(true);
        table.getTableHeader().setVisible(false);
        table.getTableHeader().setPreferredSize(new Dimension(0, 0));
    }

    public void setSettingLabelInformation(JLabel lable) {
        lable.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(App.class.getResource("/ru/ezhov/dictionary/pictures/info.png"))));
    }

    public void setSettingButtonClear(JButton button) {
        button.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(App.class.getResource("/ru/ezhov/dictionary/pictures/clear.png"))));
    }

    public void setSettingButtonAddNewWord(JButton button) {
        button.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(App.class.getResource("/ru/ezhov/dictionary/pictures/addNewWord.png"))));
    }
}