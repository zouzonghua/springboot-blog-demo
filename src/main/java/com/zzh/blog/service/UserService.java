package com.zzh.blog.service;

import com.zzh.blog.po.User;

/**
 * @Program: blog
 * @Description: 用户接口
 * @Author: zouzonghua
 * @Create: 2020-06-10 18:29
 **/
public interface UserService {
    /**
     * 检验用户
     * @param username
     * @param password
     * @return
     */
    User checkUser(String username, String password);
}
