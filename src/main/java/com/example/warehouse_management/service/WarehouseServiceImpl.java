package com.example.warehouse_management.service;

import com.example.warehouse_management.entity.Warehouse;
import com.example.warehouse_management.exception.WarehouseNotFoundException;
import com.example.warehouse_management.repository.WarehouseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WarehouseServiceImpl implements WarehouseService {
    private WarehouseRepository warehouseRepository;

    public WarehouseServiceImpl(WarehouseRepository warehouseRepository) {
        this.warehouseRepository = warehouseRepository;
    }


    @Override
    public Warehouse findById(Integer id) {
        return  warehouseRepository.findById(id).orElseThrow(()->new WarehouseNotFoundException("Warehouse not found"));
    }

    @Override
    public Warehouse save(Warehouse warehouse) {
        return warehouseRepository.save(warehouse);
    }

    @Override
    public List<Warehouse> findAll() {
        return warehouseRepository.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        warehouseRepository.deleteById(id);
    }
}
