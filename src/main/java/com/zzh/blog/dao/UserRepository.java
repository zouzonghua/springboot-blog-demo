package com.zzh.blog.dao;

import com.zzh.blog.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Program: blog
 * @Description:
 * @Author: zouzonghua
 * @Create: 2020-06-10 18:33
 **/
public interface UserRepository extends JpaRepository<User,Long> {
    /**
     * 查询用户
     * @param username
     * @param password
     * @return
     */
    User findByUsernameAndPassword(String username, String password);
}
