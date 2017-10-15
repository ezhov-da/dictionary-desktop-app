package ru.ezhov.dictionary.publicClass;

import ru.ezhov.dictionary.forma.DictionaryFrame;


public class SingletoneBasicFrame
{
    private static DictionaryFrame dictionaryFrame;

    public static DictionaryFrame getDictionaryFrame()
    {
        if (dictionaryFrame == null)
        {
            dictionaryFrame = new DictionaryFrame();
        }
        return dictionaryFrame;
    }
}
