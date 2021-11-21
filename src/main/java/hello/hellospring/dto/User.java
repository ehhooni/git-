package hello.hellospring.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Builder // 빌더를 사용할 수 있게 함
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false)
    String account;

    String email;

    String phoneNumber;
}
