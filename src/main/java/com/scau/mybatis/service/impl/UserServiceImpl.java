package com.scau.mybatis.service.impl;

import com.scau.mybatis.entity.User;
import com.scau.mybatis.mapper.UserMapper;
import com.scau.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public User get(String username) {
        return userMapper.get(username);
    }

    @Override
    public List<User> list() {
        return userMapper.list();
    }
}
