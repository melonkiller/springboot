package com.example.springboot.dal.entity;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String userName;
    private String passWord;
    private String realName;
}
