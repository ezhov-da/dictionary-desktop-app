package ru.ezhov.dictionary.publicClass;

import ru.ezhov.dictionary.connect.ConnectToBase;
import ru.ezhov.dictionary.tree.MyTreeObject;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

public class Query {
    public Object[] selectTable(String zapros)
            throws ClassNotFoundException, SQLException, IOException {
        Statement st = ConnectToBase.getConnect().createStatement();
        ResultSet rs = st.executeQuery(zapros);
        ResultSetMetaData rsmd = rs.getMetaData();
        Vector<String> columnName = new Vector();

        for (int i = 1; i <= rsmd.getColumnCount(); i++) {
            columnName.add(rsmd.getColumnName(i));
        }

        Vector<Vector<String>> VECTOR = new Vector();

        while (rs.next()) {
            Vector<String> row = new Vector();

            for (String str : columnName) {
                row.add(rs.getString(str));
            }
            VECTOR.add(row);
        }

        st.close();

        Object[] itogMass = {VECTOR, columnName};

        return itogMass;
    }

    public void insertToBase(String zapros) throws ClassNotFoundException, SQLException, ClassNotFoundException, IOException {
        Statement st = ConnectToBase.getConnect().createStatement();
        st.execute(zapros);
        st.close();
    }

    public void deleteToBase(String zapros) throws ClassNotFoundException, SQLException, ClassNotFoundException, IOException {
        Statement st = ConnectToBase.getConnect().createStatement();
        st.execute(zapros);
        st.close();
    }


    public ArrayList<MyTreeObject> treeList(String query)
            throws SQLException, ClassNotFoundException, IOException {
        Statement st = ConnectToBase.getConnect().createStatement();
        ResultSet rs = st.executeQuery(query);
        ArrayList<MyTreeObject> list = new ArrayList();

        while (rs.next()) {
            MyTreeObject myObject = new MyTreeObject();
            myObject.setId(rs.getInt("id"));
            myObject.setOne(rs.getString("One"));
            myObject.setLvl(rs.getInt("lvl"));
            myObject.setLittle(rs.getString("little"));
            list.add(myObject);
        }

        st.close();

        return list;
    }
}