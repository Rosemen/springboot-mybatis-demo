package com.scau.mybatis.service;

import com.scau.mybatis.entity.User;

import java.util.List;

public interface UserService {
    User get(String username);

    List<User> list();
}
