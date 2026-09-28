package com.example.warehouse_management.service;

import com.example.warehouse_management.entity.User;
import com.example.warehouse_management.exception.UserNotFoundException;
import com.example.warehouse_management.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Integer id) {
        return userRepository.findById(id).orElseThrow(()->new UserNotFoundException("User not found"));

    }

    @Override
    public void deleteById(Integer id) {
        userRepository.deleteById(id);
    }
}
