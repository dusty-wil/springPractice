package com.springpractice.jpaFunsies;

import com.springpractice.jpaFunsies.entity.User;
import com.springpractice.jpaFunsies.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserServiceCommandLineRunner implements CommandLineRunner
{
    @Autowired
    private UserService userService;

    private static final Logger log = LoggerFactory.getLogger(UserServiceCommandLineRunner.class);

    @Override
    public void run(String... args) throws Exception {
        User user = new User("jack", "admin");
        long id = userService.insert(user);
        log.info("New user is created: " + user);
    }
}
