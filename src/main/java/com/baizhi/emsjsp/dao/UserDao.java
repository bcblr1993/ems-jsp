package com.baizhi.emsjsp.dao;


import com.baizhi.emsjsp.entity.User;

public interface UserDao {


    //注册用户
    void save(User user);

    //用户登录
    User login(User user);
}

