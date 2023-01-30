package com.dyildirim.inventoryservice.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@FeignClient(name = "inventoryController", path = "/api/inventory")
public interface InventoryRestClient {

    @GetMapping("/isInStock")
    @ResponseStatus(HttpStatus.OK)
    boolean isInStock(@RequestParam List<String> skuCode);

}
