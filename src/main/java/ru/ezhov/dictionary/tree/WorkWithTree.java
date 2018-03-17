package ru.ezhov.dictionary.tree;

import ru.ezhov.dictionary.publicClass.Query;
import ru.ezhov.dictionary.publicClass.SingletoneBasicFrame;

import javax.swing.tree.DefaultTreeModel;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;


public class WorkWithTree {
    private final String queryS = "select \ndistinct\nt1.id,\ncase when t1.lvl = 0 then  UPPER(t1.One) else lower(t1.One) end as One,\nt1.lvl,\nt1.little\nfrom\n(\n        select \n        t1.id,\n        t1.One,\n        t1.lvl,\n        t1.little\n        from (\n                select \n                distinct \n                5000000 as id,\n                lower(left(ENGLISH,1)) as One,\n                0 as lvl,\n                lower(left(ENGLISH,1)) as little\n                from BASEDICTIONARY\n                union all\n                select \n                id,\n                lower(ENGLISH || ' - ' || RUSSIAN) as One,\n                1 as lvl,\n                lower(ENGLISH || ' - ' || RUSSIAN) as little \n                from BASEDICTIONARY\n        ) t1 \n\n        union all\n\n        select \n        t1.id,\n        t1.One,\n        t1.lvl,\n        t1.little\n        from (\n                select \n                distinct \n                5000000 as id,\n                lower(left(RUSSIAN,1)) as One,\n                0 as lvl,\n                lower(left(RUSSIAN,1)) as little\n                from BASEDICTIONARY\n                union all\n                select \n                id,\n                lower(RUSSIAN || ' - ' || ENGLISH) as One,\n                1 as lvl,\n                lower(RUSSIAN || ' - ' || ENGLISH) as little \n                from BASEDICTIONARY\n        ) t1 \n) t1 order by t1.little\n";

    public void run()
            throws SQLException, ClassNotFoundException, IOException {
        Query query = new Query();
        ArrayList<MyTreeObject> list = query.treeList("select \ndistinct\nt1.id,\ncase when t1.lvl = 0 then  UPPER(t1.One) else lower(t1.One) end as One,\nt1.lvl,\nt1.little\nfrom\n(\n        select \n        t1.id,\n        t1.One,\n        t1.lvl,\n        t1.little\n        from (\n                select \n                distinct \n                5000000 as id,\n                lower(left(ENGLISH,1)) as One,\n                0 as lvl,\n                lower(left(ENGLISH,1)) as little\n                from BASEDICTIONARY\n                union all\n                select \n                id,\n                lower(ENGLISH || ' - ' || RUSSIAN) as One,\n                1 as lvl,\n                lower(ENGLISH || ' - ' || RUSSIAN) as little \n                from BASEDICTIONARY\n        ) t1 \n\n        union all\n\n        select \n        t1.id,\n        t1.One,\n        t1.lvl,\n        t1.little\n        from (\n                select \n                distinct \n                5000000 as id,\n                lower(left(RUSSIAN,1)) as One,\n                0 as lvl,\n                lower(left(RUSSIAN,1)) as little\n                from BASEDICTIONARY\n                union all\n                select \n                id,\n                lower(RUSSIAN || ' - ' || ENGLISH) as One,\n                1 as lvl,\n                lower(RUSSIAN || ' - ' || ENGLISH) as little \n                from BASEDICTIONARY\n        ) t1 \n) t1 order by t1.little\n");


        MyDefaultMutableTreeNode mmtn = new MyDefaultMutableTreeNode(list, "Словарь");
        DefaultTreeModel dtm = new DefaultTreeModel(mmtn.createTree());

        SingletoneBasicFrame.getDictionaryFrame().jTreeBase.setModel(dtm);
        SingletoneBasicFrame.getDictionaryFrame().jTreeBase.setCellRenderer(new MyTreeCellRender());
    }
}