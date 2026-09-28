package com.example.warehouse_management.service;

import com.example.warehouse_management.entity.Transfer;

import java.util.List;

public interface TransferService {

    Transfer save(Transfer transfer);

    List<Transfer> findAll();

    Transfer findById(Integer id);

    void deleteById(Integer id);
}