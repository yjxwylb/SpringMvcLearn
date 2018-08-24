package com.learn.springmvc.controller;

import lombok.Data;

/**
 * @Author: xyj
 * @Description:
 * @CreateTime: 2018/8/8 14:57
 * @Version:
 */
@Data
public class User {

    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
