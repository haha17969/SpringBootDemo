package com.example.dao;

import com.example.bean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface userDao {



     User selectByName(@Param("username") String username);

    void insertSelective(User user);
    User login(User user);
}
