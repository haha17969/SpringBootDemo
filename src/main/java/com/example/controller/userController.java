package com.example.controller;

import com.example.bean.User;
import com.example.common.ApiRestResponse;
import com.example.common.ExeceptionEnum;
import com.example.common.MyException;
import com.example.service.userService;
import com.example.util.MD5Utils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class userController {

    @ResponseBody
    @GetMapping("/test")
    public String test() {
        return "haha";
    }

    @Autowired
    userService userservice;

    @GetMapping("/register")
    public ApiRestResponse register(@RequestParam("username") String username, @RequestParam("password") String password) {
        User result = userservice.selectByName(username);
        if (result != null)
           throw  new MyException(ExeceptionEnum.NAME_EXIT);
            User user = new User();
            user.setUsername(username);
            String MD5Password = MD5Utils.getMD5Password(password);
            user.setPassword(MD5Password);
            userservice.register(user);
           return ApiRestResponse.success();
    }

    @GetMapping("/login")
    public User login(@RequestParam("username") String username, @RequestParam("password") String password) {

        User login = userservice.login(username,password);
        return login;
    }



}