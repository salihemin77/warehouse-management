package com.example.warehouse_management.controller;

import com.example.warehouse_management.entity.User;
import com.example.warehouse_management.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> findAll(){
        return userService.findAll();
    }
    @GetMapping("/users/{id}")
    public User findById(@PathVariable Integer id){
        return userService.findById(id);
    }
    @PostMapping("/users")
    public User create(@RequestBody User user){
        return userService.save(user);
    }
    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable Integer id){
        userService.deleteById(id);
    }



}
