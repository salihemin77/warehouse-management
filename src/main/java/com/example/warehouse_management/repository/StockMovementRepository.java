package com.example.warehouse_management.repository;

import com.example.warehouse_management.entity.StockMovement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockMovementRepository extends JpaRepository<StockMovement, Integer> {

}
