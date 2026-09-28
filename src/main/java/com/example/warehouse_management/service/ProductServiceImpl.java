package com.example.warehouse_management.service;

import com.example.warehouse_management.entity.Product;
import com.example.warehouse_management.exception.ProductNotFoundException;
import com.example.warehouse_management.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(Integer id) {
        return productRepository.findById(id).orElseThrow(()->new ProductNotFoundException("Product not found"));

    }

    @Override
    public void deleteById(Integer id) {
        productRepository.deleteById(id);
    }
}
