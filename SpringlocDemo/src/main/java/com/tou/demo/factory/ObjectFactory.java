package com.tou.demo.factory;

import com.tou.demo.UsersService;
import com.tou.demo.impl.UsersServiceImpl;

/**
 * @author tom
 * @version V1.0
 * @Package com.tou.demo.factory
 * @date 2021/6/3 15:17
 */
public class ObjectFactory {
    public static UsersService getInstance(){
        return new UsersServiceImpl();
    }
}
