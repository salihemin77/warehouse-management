package com.example.warehouse_management.repository;

import com.example.warehouse_management.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
