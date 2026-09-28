package com.example.warehouse_management.service;

import com.example.warehouse_management.entity.Inventory;
import com.example.warehouse_management.exception.InventoryNotFoundException;
import com.example.warehouse_management.repository.InventoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryServiceImpl implements InventoryService {
    private InventoryRepository inventoryRepository;

    public InventoryServiceImpl(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }


    @Override
    public Inventory save(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }

    @Override
    public Inventory findById(Integer id) {
        return inventoryRepository.findById(id).orElseThrow(()->new InventoryNotFoundException("Inventory not found"));

    }

    @Override
    public List<Inventory> findAll() {
        return inventoryRepository.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        inventoryRepository.deleteById(id);
    }
}
