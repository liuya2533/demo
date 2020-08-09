package com.example.controller;

import com.example.dao.User;
import com.example.service.UserManageService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class HelloWorld {

    @Autowired
    private UserManageService userService;

    @PostMapping(value = "/login")
    public String userLogin(@RequestBody User user, ModelMap modelMap){
        User resultUser = userService.userLogin(user);
        modelMap.addAttribute(resultUser.getCode(),resultUser);
        Gson gson = new Gson();
        return gson.toJson(resultUser);
    }

    @GetMapping(value = "/sing")
    public String sing(String code,ModelMap modelMap){
        User user = (User)modelMap.getAttribute(code);
        if(user!=null){
            Gson gson = new Gson();
            return gson.toJson(user);
        }
        List<User>  results = userService.getAllUser();
        Gson gson = new Gson();
        return gson.toJson(results);
    }


}
