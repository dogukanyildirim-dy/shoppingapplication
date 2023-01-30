package com.dyildirim.inventoryservice.service;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface InventoryService {
    @Transactional(readOnly = true)
    boolean isInStock(List<String> skuCodeList);
}
