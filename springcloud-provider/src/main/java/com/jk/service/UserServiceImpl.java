package com.jk.service;

import com.jk.mapper.UserMapper;
import com.jk.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public UserModel userlogin(String userName) {
        return userMapper.queryUser(userName);
    }
}
