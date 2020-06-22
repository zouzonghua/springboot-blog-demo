package com.zzh.blog.dao;

import com.zzh.blog.po.Type;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Program: blog
 * @Description:
 * @Author: zouzonghua
 * @Create: 2020-06-11 08:27
 **/
public interface TypeRepository extends JpaRepository<Type,Long> {
    Type findByName(String name);
}
