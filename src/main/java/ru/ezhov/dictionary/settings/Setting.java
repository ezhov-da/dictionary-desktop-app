package ru.ezhov.dictionary.settings;

import ru.ezhov.dictionary.App;
/* 4: */ import java.awt.Dimension;
/* 5: */ import java.awt.Toolkit;
/* 6: */ import javax.swing.ImageIcon;
/* 7: */ import javax.swing.JButton;
/* 8: */ import javax.swing.JLabel;
/* 9: */ import javax.swing.JTable;
/* 10: */

/* 21: */ public class Setting
/* 22: */ {
    /* 23: */ public void setSettingTable(JTable table)
    /* 24: */ {
        /* 25:25 */ table.setShowHorizontalLines(false);
        /* 26:26 */ table.setShowVerticalLines(true);
        /* 27: */
        /* 28: */
        /* 29: */
        /* 30:30 */ table.getTableHeader().setVisible(false);
        /* 31:31 */ table.getTableHeader().setPreferredSize(new Dimension(0, 0));
        /* 32: */    }
    /* 33: */
    /* 34: */ public void setSettingLabelInformation(JLabel lable)
    /* 35: */ {
        /* 36:36 */ lable.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(App.class.getResource("/ru/ezhov/dictionary/pictures/info.png"))));
        /* 37: */    }
    /* 38: */
    /* 39: */ public void setSettingButtonClear(JButton button)
    {
        /* 40:40 */ button.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(App.class.getResource("/ru/ezhov/dictionary/pictures/clear.png"))));
        /* 41: */    }
    /* 42: */
    /* 43: */ public void setSettingButtonAddNewWord(JButton button)
    {
        /* 44:44 */ button.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(App.class.getResource("/ru/ezhov/dictionary/pictures/addNewWord.png"))));
        /* 45: */    }
    /* 46: */ }



/* Location: E:\dictionary\App.jar
 *
 * Qualified Name: settings.Setting
 *
 * JD-Core Version: 0.7.0.1
 *
 */
