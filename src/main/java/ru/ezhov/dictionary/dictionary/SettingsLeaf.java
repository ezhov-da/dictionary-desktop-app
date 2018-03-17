package ru.ezhov.dictionary.dictionary;

import ru.ezhov.dictionary.forma.DictionaryFrame;
import ru.ezhov.dictionary.publicClass.MyProperties;
import ru.ezhov.dictionary.publicClass.SingletoneBasicFrame;

import java.io.IOException;


public class SettingsLeaf {
    public void setSettings()
            throws IOException {
        DictionaryFrame frame = SingletoneBasicFrame.getDictionaryFrame();

        String path = null;
        String port = null;
        boolean flag = false;
        if (MyProperties.getProperties("saveSettings").equals("default")) {
            path = MyProperties.getProperties("defailtPathBase");
            port = MyProperties.getProperties("defaultPort");
            flag = false;
        } else if (MyProperties.getProperties("saveSettings").equals("changed")) {
            path = MyProperties.getProperties("changePathBase");
            port = MyProperties.getProperties("changePort");
            flag = true;
        }

        frame.jTextFieldPathToURL.setText(port);
        frame.jTextFieldPathToBase.setText(path);
        frame.jCheckBoxSettings.setSelected(flag);
    }

    public void setNewSettings()
            throws IOException {
        DictionaryFrame frame = SingletoneBasicFrame.getDictionaryFrame();

        if (frame.jCheckBoxSettings.isSelected()) {
            MyProperties.setProperties("changePathBase", frame.jTextFieldPathToBase.getText());
            MyProperties.setProperties("changePort", frame.jTextFieldPathToURL.getText());
            MyProperties.setProperties("saveSettings", "changed");
        } else if (!frame.jCheckBoxSettings.isSelected()) {
            MyProperties.setProperties("saveSettings", "default");
        }

        MyProperties.set();
        setSettings();
    }
}