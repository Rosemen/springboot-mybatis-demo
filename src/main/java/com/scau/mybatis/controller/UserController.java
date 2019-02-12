package com.scau.mybatis.controller;

import com.scau.mybatis.entity.User;
import com.scau.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/get/{username}",method = RequestMethod.GET)
    public User get(@PathVariable("username") String username){
        return userService.get(username);
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<User> list(){
        return userService.list();
    }
}
