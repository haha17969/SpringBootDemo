package com.example.service.serviceimpl;

import com.example.bean.User;
import com.example.common.ExeceptionEnum;
import com.example.common.MyException;
import com.example.dao.userDao;
import com.example.service.userService;
import com.example.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements userService {
    @Autowired
    userDao userdao;


    @Override
    public void register(User user) {
       User  result = userdao.selectByName(user.getUsername());
        if(result!=null){
            throw new RuntimeException("姓名已存在");
        }
           userdao.insertSelective(user);
    }

    @Override
    public User selectByName(String userName) {
        User user = userdao.selectByName(userName);
        return user;
    }

    @Override
    public User login(String username, String password) {
        User user=new User();
        user.setUsername(username);
        String MD5Password= MD5Utils.getMD5Password(password);
        user.setPassword(MD5Password);
        User login=userdao.login(user);
        if(login==null){
           throw new  MyException(ExeceptionEnum.WRONG_MESSAGE);
        }
        return login;
    }


}
