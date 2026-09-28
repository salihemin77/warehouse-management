package com.example.warehouse_management.repository;

import com.example.warehouse_management.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Integer> {


}
