/*  1:   */ package ru.ezhov.dictionary.connect;
/* 2: */
/* 3: */ import java.io.IOException;
/* 4: */ import java.sql.Connection;
/* 5: */ import java.sql.DriverManager;
/* 6: */ import java.sql.SQLException;
/* 7: */ import ru.ezhov.dictionary.publicClass.MyProperties;
/* 8: */
/* 9: */
/* 10: */
/* 11: */
/* 12: */
/* 13: */
/* 14: */
/* 15: */
/* 16: */ public class ConnectToBase
/* 17: */ {
    /* 18: */ private static Connection connect;
    /* 19: */
    /* 20: */ public static Connection getConnect()
            /* 21: */ throws ClassNotFoundException, SQLException, IOException
    /* 22: */ {
        /* 23:23 */ if (connect == null)
        /* 24: */ {
            /* 31: */
            /* 32:32 */ String path = null;
            /* 33:33 */ String port = null;
            /* 34:34 */ if (MyProperties.getProperties("saveSettings").equals("default"))
            {
                /* 35:35 */ path = MyProperties.getProperties("defailtPathBase");
                /* 36:36 */ port = MyProperties.getProperties("defaultPort");
                /* 37:37 */            } else if (MyProperties.getProperties("saveSettings").equals("changed"))
            {
                /* 38:38 */ path = MyProperties.getProperties("changePathBase");
                /* 39:39 */ port = MyProperties.getProperties("changePort");
                /* 40: */            }
            /* 41: */
            /* 42:42 */ String dbUrl1 = "jdbc:h2:" + MyProperties.getAbsolutePathToBase();
            /* 43: */
            /* 44: */
            /* 45:45 */ Class.forName("org.h2.Driver");
            /* 46: */
            /* 47: */
            /* 48:48 */ connect = DriverManager.getConnection(dbUrl1);
            /* 49: */        }
        /* 50: */
        /* 51:51 */ return connect;
        /* 52: */    }
    /* 53: */ }



/* Location:           E:\dictionary\Dictionary.jar

 * Qualified Name:     connect.ConnectToBase

 * JD-Core Version:    0.7.0.1

 */
