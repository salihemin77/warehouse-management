package com.example.warehouse_management.exception;

public class WarehouseNotFoundException extends RuntimeException {
    public WarehouseNotFoundException(String message){
        super(message);
    }
}
