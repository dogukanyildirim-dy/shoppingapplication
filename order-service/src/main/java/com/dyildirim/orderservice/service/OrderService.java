package com.dyildirim.orderservice.service;

import com.dyildirim.orderservice.dto.OrderRequest;
import com.dyildirim.orderservice.model.Order;

import java.util.List;

public interface OrderService {
    void placeOrder(OrderRequest orderRequest);

    List<Order> readOrders();
}