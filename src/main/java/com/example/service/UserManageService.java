package com.example.service;

import com.example.dao.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserManageService {
    public List<User> getAllUser();

    public User userLogin(User user);
}
