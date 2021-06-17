package com.baizhi.emsjsp.service;

import com.baizhi.emsjsp.dao.UserDao;
import com.baizhi.emsjsp.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;

@Service
@Transactional
public class UserServiceImpl  implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public User login(User user) {
        //加密密码
        user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes(StandardCharsets.UTF_8)));
        return userDao.login(user);
    }

    @Override
    public void save(User user) {
        //加密密码
        user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes(StandardCharsets.UTF_8)));
        userDao.save(user);
    }
}
