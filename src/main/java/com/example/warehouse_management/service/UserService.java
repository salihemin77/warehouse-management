package com.example.warehouse_management.service;

import com.example.warehouse_management.entity.Transfer;
import com.example.warehouse_management.entity.User;

import java.util.List;

public interface UserService  {
    User save(User user);
    List<User> findAll();
    User findById(Integer id);
    void deleteById(Integer id);
    
}
