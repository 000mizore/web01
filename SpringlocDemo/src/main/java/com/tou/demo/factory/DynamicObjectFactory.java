package com.tou.demo.factory;

import com.tou.demo.UsersService;
import com.tou.demo.impl.UsersServiceImpl;

/**
 * @author tom
 * @version V1.0
 * @Package com.tou.demo.factory
 * @date 2021/6/3 15:31
 * @Copyright ©网时代教育
 */
public class DynamicObjectFactory {
    public UsersService getInstance(){
        return new UsersServiceImpl();
    }
}
