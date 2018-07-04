package com.daphne.study.service;

import com.daphne.study.entity.UserEntity;
import com.daphne.study.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserEntity> findAll(){
        return userRepository.findAll();
    }


}
