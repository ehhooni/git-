package hello.hellospring.controller;

import hello.hellospring.dao.TestDAO;
import hello.hellospring.dto.TestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DBConnectTestCtrl {
    @Autowired(required = true)
    private TestDAO testDAO;

    @GetMapping("/hello")
    public List<TestDto> HelloWorld() {
        return testDAO.getTestData();
    }
}
