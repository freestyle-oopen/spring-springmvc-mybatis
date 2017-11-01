package com.ren.qq.service.impl;

import com.ren.qq.mapper.UserDao;
import com.ren.qq.pojo.SearchInfo;
import com.ren.qq.pojo.User;
import com.ren.qq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    public UserDao userDao;

    public boolean addUser(User user) {
        int i=0;
        return 0<userDao.addUser(user);
    }

    @Override
    public User findUserByName(String name) {
        return userDao.findUserByName(name);
    }

    @Override
    public boolean delectUser(User user) {
        return 0<userDao.delectUser(user);
    }

    @Override
    public List<User> searchUser(SearchInfo searchInfo) {
        List<User> users= userDao.searchUser(searchInfo);
        return users;
    }
}
