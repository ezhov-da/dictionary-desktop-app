package ru.ezhov.dictionary.publicClass;

public class HideDictionaryFrame {
    public void hide() {
        SingletoneBasicFrame.getDictionaryFrame().setVisible(false);
    }
}
