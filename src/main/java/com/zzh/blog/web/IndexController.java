package com.zzh.blog.web;

import com.zzh.blog.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @program: blog
 * @description: 这是一个web控制器
 * @author: zouzonghua
 * @create: 2020-06-10 12:24
 **/
@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/blog")
    public String blog() {
        return "admin/index";
    }

}
