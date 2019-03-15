package com.zhu.springbootle.controller;


import com.zhu.springbootle.entity.User;
import com.zhu.springbootle.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;
    @GetMapping("/user/{id}")
    public Optional getUser(@PathVariable("id") Integer id){
        Optional<User>user=  userRepository.findById(id);
    return user;
    }
    @GetMapping("/user")
    public User insertuser(User user){
        User save=userRepository.save(user);
        return save;
    }
}
