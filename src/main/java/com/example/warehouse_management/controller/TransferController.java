package com.example.warehouse_management.controller;

import com.example.warehouse_management.entity.Transfer;
import com.example.warehouse_management.service.TransferService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TransferController {

    private TransferService transferService;

    public TransferController(TransferService transferService) {
        this.transferService = transferService;
    }

    @GetMapping("/transfers")
    public List<Transfer> findAll() {
        return transferService.findAll();
    }

    @GetMapping("/transfers/{id}")
    public Transfer findById(@PathVariable Integer id) {
        return transferService.findById(id);
    }

    @PostMapping("/transfers")
    public Transfer save(@RequestBody Transfer transfer) {
        return transferService.save(transfer);
    }

    @DeleteMapping("/transfers/{id}")
    public void deleteById(@PathVariable Integer id) {
        transferService.deleteById(id);
    }
}