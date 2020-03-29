package com.fmalessio.unittest.service;

import com.fmalessio.unittest.entity.User;
import com.fmalessio.unittest.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        List<User> users = userRepository.findAll();
        for (User user : users) {
            log.info("My name is: " + user.getFirstName() + " " + user.getLastName());
        }
        return users;
    }

}
