package com.demo.orderservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public List<PurchaseOrder> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public PurchaseOrder getOrderById(@PathVariable String id) {
        return orderService.getOrderById(id);
    }

    @PostMapping
    public PurchaseOrder addOrder(@RequestBody PurchaseOrder order) {
        return orderService.addOrder(order);
    }
}
