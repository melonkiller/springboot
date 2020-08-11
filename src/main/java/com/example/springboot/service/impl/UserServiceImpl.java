package com.example.springboot.service.impl;

import com.example.springboot.dal.entity.User;
import com.example.springboot.dal.mapper.UserMapper;
import com.example.springboot.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserServiceImpl implements IUserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserById(int userId) {
        User user = userMapper.getUserById(userId);
        log.info(user.toString());
        return user;
    }
}
