package com.tou.demo.impl;

import com.tou.demo.UsersService;

/**
 * @author mizore
 * @version V1.0
 * @Package com.tou.demo.impl
 * @date 2021/6/3 14:28
 */
public class UsersServiceImpl implements UsersService {
    public UsersServiceImpl(){
        System.out.println("Init.......");
    }
    @Override
    public void addUsers() {
        System.out.println("UsersService addUsers ......");
    }
}