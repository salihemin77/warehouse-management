package com.example.warehouse_management.controller;

import com.example.warehouse_management.entity.Inventory;
import com.example.warehouse_management.service.InventoryService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class InventoryController {
    private InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @GetMapping("/inventories")
    public List<Inventory> findAll() {
        return inventoryService.findAll();
    }
    @GetMapping("/inventories/{id}")
    public Inventory findById(@PathVariable Integer id) {
        return inventoryService.findById(id);
    }
    @PostMapping("/inventories")
    public Inventory save( @Valid @RequestBody Inventory inventory) {
        return inventoryService.save(inventory);
    }
    @DeleteMapping("/inventories/{id}")
    public void deleteById(@PathVariable Integer id) {
        inventoryService.deleteById(id);
    }


}
