package ru.ezhov.dictionary.publicClass;

import java.io.*;
import java.net.URLDecoder;
import java.util.Properties;

public class MyProperties {
    private static Properties properties = null;

    private static String dirPath = null;
    private static File file = null;
    private static FileInputStream fileReadre = null;

    public static String getProperties(String key)
            throws IOException {
        set();
        String finalString = URLDecoder.decode(properties.getProperty(key), "UTF-8");
        return finalString;
    }

    public static void setProperties(String key, String value)
            throws IOException {
        set();
        properties.setProperty(key, value);
        FileOutputStream fileWriter = new FileOutputStream(file);
        properties.storeToXML(fileWriter, "myProperties", "UTF-8");
    }

    public static void set()
            throws FileNotFoundException, IOException {
        properties = new Properties();
        dirPath = "basic";
        file = new File("properties.xml");
        fileReadre = new FileInputStream(dirPath + File.separator + file);
        properties.loadFromXML(fileReadre);
    }

    public static String getAbsolutePathToBase() {
        return new File(dirPath + File.separator + properties.getProperty("defailtPathBase")).getAbsolutePath();
    }

    public static String dirPath()
            throws IOException {
        set();
        return dirPath;
    }
}
