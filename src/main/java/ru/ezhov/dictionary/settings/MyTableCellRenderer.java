package ru.ezhov.dictionary.settings;

import ru.ezhov.dictionary.App;

import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import java.awt.*;

public class MyTableCellRenderer
        extends JLabel
        implements TableCellRenderer {
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        setText((String) value);

        if (getText().equals("1")) {
            setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(App.class.getResource("/ru/ezhov/dictionary//pictures/redStar.png"))));
            setText("");
            setToolTipText("Полное совпадение");
        }
        if (getText().equals("0")) {
            setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(App.class.getResource("/ru/ezhov/dictionary//pictures/whiteCircle.png"))));
            setText("");
            setToolTipText("Частичное совпадение");
        }

        if (getText().equals("r#$")) {
            setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(App.class.getResource("/ru/ezhov/dictionary//pictures/refresh.png"))));
            setText("");
            setToolTipText("Обновить строку");
        }

        if (getText().equals("d#$")) {
            setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(App.class.getResource("/ru/ezhov/dictionary//pictures/delete.png"))));
            setText("");
            setToolTipText("Удалить строку");
        }
        return this;
    }
}