package com.example.springboot.service;

import com.example.springboot.dal.entity.User;

public interface IUserService {
    User getUserById(int userId);
}
