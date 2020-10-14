package com.example.demo;

import com.example.demo.Bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class YamlDemoApplicationTests {
    @Autowired
    Person person;
    @Test
    public void Test1(){
        System.out.println(person);
    }


}
