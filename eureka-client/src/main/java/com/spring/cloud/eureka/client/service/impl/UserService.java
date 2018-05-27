package com.spring.cloud.eureka.client.service.impl;

import com.spring.cloud.eureka.client.dao.first.user.UserDao;
import com.spring.cloud.eureka.client.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    public String getUser(Integer id) {
        return userDao.getUserNameById(id);
    }
}
