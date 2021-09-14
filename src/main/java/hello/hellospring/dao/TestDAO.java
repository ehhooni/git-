package hello.hellospring.dao;

import hello.hellospring.dto.TestDto;

import java.util.List;

public interface TestDAO {
    List<TestDto> getTestData();
}
