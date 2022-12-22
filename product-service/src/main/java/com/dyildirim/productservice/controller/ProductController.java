package com.dyildirim.productservice.controller;

import com.dyildirim.productservice.dto.ProductRequest;
import com.dyildirim.productservice.dto.ProductResponse;
import com.dyildirim.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping(value = "/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest) {
        productService.createProduct(productRequest);
    }

    @GetMapping(value = "/getAllProducts")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<ProductResponse> getAllProducts() {
        return productService.getAllProducts();

    }

}
