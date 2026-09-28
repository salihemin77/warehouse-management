package com.example.warehouse_management.exception;

public class TransferNotFoundException  extends RuntimeException {
    public TransferNotFoundException(String message) {
        super(message);
    }
}
