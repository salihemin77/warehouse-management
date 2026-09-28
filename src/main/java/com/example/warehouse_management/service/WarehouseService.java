package com.example.warehouse_management.service;

import com.example.warehouse_management.entity.Warehouse;

import java.util.List;

public interface WarehouseService {
    Warehouse findById(Integer id);
    Warehouse save(Warehouse warehouse);
    List<Warehouse> findAll();
     void deleteById(Integer id);

}
