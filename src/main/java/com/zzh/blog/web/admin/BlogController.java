package com.zzh.blog.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Program: blog
 * @Description: 博客拦截器
 * @Author: zouzonghua
 * @Create: 2020-06-10 19:28
 **/
@Controller
@RequestMapping("/admin")
public class BlogController {
    @GetMapping("/blogs")
    public String blogs() {
        return "admin/blogs";
    }

}
