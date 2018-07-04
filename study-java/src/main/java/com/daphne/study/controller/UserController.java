package com.daphne.study.controller;

import com.daphne.study.entity.UserEntity;
import com.daphne.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(name = "/user")
    public List<UserEntity> findBy(
            @RequestParam(value="userid", required=false) String userid,
            @RequestParam(value="username", required=false) String username){
        if ((userid == null) && (username == null)){
            return userService.findAll();
        }

        return userService.findAll();
    }
}
