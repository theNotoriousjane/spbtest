package com.example.demo.dao;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    User userlogin(@Param("username") String username, @Param("password") String password);
    int adduser(@Param("username") String username, @Param("password") String password);
}
