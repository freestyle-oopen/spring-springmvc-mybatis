package com.ren.qq.mapper;

import com.ren.qq.pojo.SearchInfo;
import com.ren.qq.pojo.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    int addUser(User user);
    User findUserByName(String name);
    int delectUser(User user);
    List<User> searchUser(SearchInfo searchInfo);
}
