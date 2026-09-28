package com.example.warehouse_management.repository;

import com.example.warehouse_management.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository   extends JpaRepository<Product,Integer>
{

}
