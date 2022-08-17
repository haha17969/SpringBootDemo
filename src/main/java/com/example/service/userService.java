package com.example.service;

import com.example.bean.User;

public interface userService {

    public void register(User user);

    public User selectByName(String userName);
    User login(String username,String password);
}
