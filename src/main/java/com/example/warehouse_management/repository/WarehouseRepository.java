package com.example.warehouse_management.repository;

import com.example.warehouse_management.entity.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WarehouseRepository extends JpaRepository<Warehouse,Integer> {

}
