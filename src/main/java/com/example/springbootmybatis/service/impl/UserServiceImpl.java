package com.example.springbootmybatis.service.impl;

import com.example.springbootmybatis.mapper.UserMapper;
import com.example.springbootmybatis.pojo.User;
import com.example.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// this is userService
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectById(Integer id) {
        return userMapper.selectById(id);
    }
}
