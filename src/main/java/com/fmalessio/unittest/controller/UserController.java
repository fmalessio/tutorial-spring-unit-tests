package com.fmalessio.unittest.controller;

import com.fmalessio.unittest.entity.User;
import com.fmalessio.unittest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/checkhealth")
    public String checkHealth() {
        return "Alive";
    }

    @GetMapping(value = "/findall")
    @ResponseBody
    public List<User> findAll() {
        return userService.findAll();
    }

}
