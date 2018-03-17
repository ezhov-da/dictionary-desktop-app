package ru.ezhov.dictionary.publicClass;

import org.h2.tools.Server;

import java.sql.SQLException;

public class SingletoneServer {
    private static Server server = null;
    private static String serverPort = null;

    public static Server getServer()
            throws SQLException {
        if (server == null) {
            server = Server.createTcpServer(new String[]{"-tcp"});
            serverPort = server.getURL();
        }
        return server;
    }

    public static String getServerPort() {
        return serverPort;
    }
}