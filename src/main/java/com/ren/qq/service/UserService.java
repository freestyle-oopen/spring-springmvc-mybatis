package com.ren.qq.service;

import com.ren.qq.pojo.SearchInfo;
import com.ren.qq.pojo.User;

import java.util.List;

public interface UserService {
    boolean addUser(User user);
    User findUserByName(String name);

    boolean delectUser(User user);

    List<User> searchUser(SearchInfo searchInfo);
}
