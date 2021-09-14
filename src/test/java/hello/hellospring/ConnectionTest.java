package hello.hellospring;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Connection;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ConnectionTest {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Test
    public void connection_test() {
        try (Connection conn  =sqlSessionFactory.openSession().getConnection()) {
            System.out.println("connection Success");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
