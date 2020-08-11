package com.example.springboot.dal.mapper;

import com.example.springboot.dal.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    /**
     * 获取用户信息
     * @param id
     * @return
     */
    User getUserById(int id);
}
