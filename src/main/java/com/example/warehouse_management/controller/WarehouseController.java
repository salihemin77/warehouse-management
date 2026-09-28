package com.example.warehouse_management.controller;

import com.example.warehouse_management.entity.Warehouse;
import com.example.warehouse_management.service.WarehouseService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class WarehouseController  {
    private WarehouseService warehouseService;

    public WarehouseController(WarehouseService warehouseService) {
        this.warehouseService = warehouseService;
    }

    @GetMapping("/warehouses")
    public List<Warehouse> getAllWarehouses(){
        return warehouseService.findAll();
    }
    @GetMapping("/warehouses/{id}")
    public Warehouse getWarehouseById(@PathVariable Integer id){
        return warehouseService.findById(id);
    }
    @PostMapping("/warehouses")
    public Warehouse createWarehouse(@Valid @RequestBody Warehouse warehouse){
        return warehouseService.save(warehouse);
    }
    @DeleteMapping("/warehouses/{id}")
    public void deleteWarehouseById(@PathVariable Integer id){
        warehouseService.deleteById(id);
    }







}
