import com.ly1240.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybatis {
    @Test
    public void testMybatis() throws IOException {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = build.openSession();
        session.insert("account.insert");
        session.commit();



    }

    @Test
    public void testselect() throws IOException {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = build.openSession();
        List<Account> list = session.selectList("account.selectAll");
        for (Account account : list) {
            System.out.println(account);
        }


        session.commit();



    }



}
