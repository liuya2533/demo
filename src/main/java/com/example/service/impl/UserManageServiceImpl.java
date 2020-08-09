package com.example.service.impl;

import com.example.dao.User;
import com.example.mapper.UserMapper;
import com.example.service.UserManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class UserManageServiceImpl implements UserManageService {
    @Autowired
    UserMapper userMapper ;
    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public User userLogin(User user) {
        return userMapper.getUserByPwd(user.getCode(),user.getPwd());
    }
}
