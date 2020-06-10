package com.zzh.blog.service;

import com.zzh.blog.dao.UserRepository;
import com.zzh.blog.po.User;
import com.zzh.blog.util.Md5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Program: blog
 * @Description:
 * @Author: zouzonghua
 * @Create: 2020-06-10 18:30
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, Md5Utils.code(password));
        return user;
    }
}
