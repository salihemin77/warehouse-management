package com.example.warehouse_management.controller;

import com.example.warehouse_management.entity.User;
import com.example.warehouse_management.service.UserService;
import jakarta.validation.Valid;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    private UserService userService;
    private PasswordEncoder passwordEncoder;

    public UserController(PasswordEncoder passwordEncoder, UserService userService) {
        this.passwordEncoder = passwordEncoder;
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
    public User create( @Valid @RequestBody User user){

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userService.save(user);
    }
    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable Integer id){
        userService.deleteById(id);
    }



}
