package com.acompe.service;

import com.acompe.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UserServiceTest{
    @Test
    public void findAll() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Service.xml");
        UserService userService = context.getBean("userService",UserService.class);
        for (User user : userService.findAll()) {
            System.out.println(user);
        }
    }

    public void findById(Long id) {
    }

    public void deleteById(Long id) {
    }

    public void add(User user) {
    }

    public void update(User user) {
    }
}
