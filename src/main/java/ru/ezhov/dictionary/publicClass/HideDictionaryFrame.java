package ru.ezhov.dictionary.publicClass;

import ru.ezhov.dictionary.forma.DictionaryFrame;


public class HideDictionaryFrame
{
    public void hide()
    {
        SingletoneBasicFrame.getDictionaryFrame().setVisible(false);
    }
}
