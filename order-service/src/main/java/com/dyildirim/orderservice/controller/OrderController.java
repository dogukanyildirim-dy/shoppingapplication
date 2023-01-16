package com.dyildirim.orderservice.controller;

import com.dyildirim.orderservice.dto.OrderRequest;
import com.dyildirim.orderservice.model.Order;
import com.dyildirim.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequest orderRequest) {
        orderService.placeOrder(orderRequest);
        return "Order Placed Successfully";
    }

    @GetMapping("/readAll")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Order> allOrders(){
        return orderService.readOrders();
    }

}
