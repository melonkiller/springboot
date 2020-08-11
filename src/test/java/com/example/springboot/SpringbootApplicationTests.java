package com.example.springboot;

import com.example.springboot.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootApplicationTests {

    @Autowired
    IUserService userService;

    @Test
    void contextLoads() {
        userService.getUserById(1);
    }

}
