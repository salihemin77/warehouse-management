package com.example.warehouse_management.service;

import com.example.warehouse_management.entity.Inventory;

import java.util.List;

public interface InventoryService {
    Inventory save(Inventory inventory);
    Inventory findById(Integer id);
    List<Inventory> findAll();
    void deleteById(Integer id);
}
