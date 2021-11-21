package hello.hellospring;

import hello.hellospring.dto.User;
import hello.hellospring.repository.UserRepository;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@SpringBootTest
@ExtendWith(SpringExtension.class)
public class UserRepositoryTest {
    @Autowired
    UserRepository userRepository;
    @Test
    public void readTest() {
       List<User> userList= userRepository.findAll();

        for (User temp : userList) {
            assertThat(temp.getEmail()).equals("test@naver.com");
        }
    }
}
