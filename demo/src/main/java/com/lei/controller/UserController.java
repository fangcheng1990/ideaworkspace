package com.lei.controller;

import com.github.pagehelper.Page;
import com.lei.entity.PoetryWord;
import com.lei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/index")
    public Object index() {
        return "hello";
    }

    @PostMapping("/list")
    public Object list(PoetryWord request) {
        Page page = userService.list(request);
        return page;
    }
}
