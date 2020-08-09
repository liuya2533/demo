package com.example.mapper;

import com.example.dao.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    public List<User> getAllUser();

    public User getUserByPwd(String code,String pwd);
}
