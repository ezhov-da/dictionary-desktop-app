package ru.ezhov.dictionary.connect;

import ru.ezhov.dictionary.publicClass.MyProperties;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectToBase {
    private static Connection connect;

    public static Connection getConnect()
            throws ClassNotFoundException, SQLException, IOException {
        if (connect == null) {

            String path = null;
            String port = null;
            if (MyProperties.getProperties("saveSettings").equals("default")) {
                path = MyProperties.getProperties("defailtPathBase");
                port = MyProperties.getProperties("defaultPort");
            } else if (MyProperties.getProperties("saveSettings").equals("changed")) {
                path = MyProperties.getProperties("changePathBase");
                port = MyProperties.getProperties("changePort");
            }

            String dbUrl1 = "jdbc:h2:" + MyProperties.getAbsolutePathToBase();

            Class.forName("org.h2.Driver");

            connect = DriverManager.getConnection(dbUrl1);
        }

        return connect;
    }
}