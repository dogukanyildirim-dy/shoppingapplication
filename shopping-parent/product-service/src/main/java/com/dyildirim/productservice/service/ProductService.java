package com.dyildirim.productservice.service;

import com.dyildirim.productservice.dto.ProductRequest;
import com.dyildirim.productservice.dto.ProductResponse;

import java.util.List;

public interface ProductService {

    void createProduct(ProductRequest productRequest);

    List<ProductResponse> getAllProducts();
}
