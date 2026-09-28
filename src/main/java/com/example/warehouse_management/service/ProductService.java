package com.example.warehouse_management.service;

import com.example.warehouse_management.entity.Product;

import java.util.List;

public interface ProductService {
    Product save(Product product);
    List<Product> findAll();
    Product findById(Integer id);
    void deleteById(Integer id);
}
