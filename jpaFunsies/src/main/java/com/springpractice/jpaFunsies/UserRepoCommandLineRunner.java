package com.springpractice.jpaFunsies;

import com.springpractice.jpaFunsies.entity.User;
import com.springpractice.jpaFunsies.repository.UserRepository;
import com.springpractice.jpaFunsies.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserRepoCommandLineRunner implements CommandLineRunner
{
    @Autowired
    private UserRepository userRepo;

    private static final Logger log = LoggerFactory.getLogger(UserRepoCommandLineRunner.class);

    @Override
    public void run(String... args) throws Exception {
        User user = new User("jill", "admin");
        User res = userRepo.save(user);
        log.info("New user is created: " + res);

        Optional<User> u = userRepo.findById(1L);
        log.info("User found: " + user);

        List<User> userList = userRepo.findAll();
        log.info("All users: " + userList);
    }
}
