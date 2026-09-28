package com.example.warehouse_management.controller;

import com.example.warehouse_management.entity.Product;
import com.example.warehouse_management.repository.ProductRepository;
import com.example.warehouse_management.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> findAll(){
        return productService.findAll();
    }
    @GetMapping("/products/{id}")
    public Product findById(@PathVariable Integer id){
        return productService.findById(id);
    }
    @PostMapping("/products")
    public Product save(@RequestBody Product product){
        return productService.save(product);
    }
    @DeleteMapping("/products/{id}")
    public void deleteById(@PathVariable Integer id){
        productService.deleteById(id);
    }




}
