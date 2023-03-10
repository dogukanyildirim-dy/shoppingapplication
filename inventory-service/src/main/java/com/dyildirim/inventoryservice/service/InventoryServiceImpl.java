package com.dyildirim.inventoryservice.service;

import com.dyildirim.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class InventoryServiceImpl implements InventoryService {

    private final InventoryRepository inventoryRepository;

    @Override
    @Transactional(readOnly = true)
    public boolean isInStock(String skuCode) {
        //return inventoryRepository.findBySkuCode(skuCode).isPresent();
        return inventoryRepository.existsBySkuCode(skuCode);
    }
}
