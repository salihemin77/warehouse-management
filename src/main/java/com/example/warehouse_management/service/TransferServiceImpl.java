package com.example.warehouse_management.service;

import com.example.warehouse_management.entity.Transfer;
import com.example.warehouse_management.exception.TransferNotFoundException;
import com.example.warehouse_management.repository.TransferRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransferServiceImpl implements TransferService {

    private TransferRepository transferRepository;

    public TransferServiceImpl(TransferRepository transferRepository) {
        this.transferRepository = transferRepository;
    }

    @Override
    public Transfer save(Transfer transfer) {
        return transferRepository.save(transfer);
    }

    @Override
    public List<Transfer> findAll() {
        return transferRepository.findAll();
    }

    @Override
    public Transfer findById(Integer id) {
        return transferRepository.findById(id)
                .orElseThrow(() -> new TransferNotFoundException("Transfer not found"));
    }

    @Override
    public void deleteById(Integer id) {
        transferRepository.deleteById(id);
    }
}