package com.scau.mybatis.mapper;

import com.scau.mybatis.entity.User;

import java.util.List;

public interface UserMapper {
    User get(String username);
    List<User> list();
}
