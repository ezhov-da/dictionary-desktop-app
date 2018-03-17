package ru.ezhov.dictionary.publicClass;

import java.io.IOException;

public class DefaultSettings {
    public void setDefault()
            throws IOException {
        MyProperties.setProperties("defailtPathBase", MyProperties.dirPath() + "\\basedictionary\\basedictionary");
        MyProperties.setProperties("defaultPort", SingletoneServer.getServerPort());
    }
}