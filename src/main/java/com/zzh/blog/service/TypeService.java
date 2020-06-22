package com.zzh.blog.service;

import com.zzh.blog.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @Program: blog
 * @Description: 分类接口
 * @Author: zouzonghua
 * @Create: 2020-06-11 08:23
 **/
public interface TypeService {
    Type saveType(Type type);

    Type getType(Long id);

    Type getTypeByName(String name);

    Page<Type> listType(Pageable pageable);

    Type UpdateType(Long id, Type type);

    void deleteType(Long id);
}
