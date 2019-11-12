package com.example.demo.service;

import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginService {
    @Autowired
    private UserMapper usermapper;

    //用户登录
    public User userlogin(String username,String password){
        User user = usermapper.userlogin(username,password);
        return user;
    }
    public int adduser(String username,String password){

        return usermapper.adduser(username,password);
        
    }

}
