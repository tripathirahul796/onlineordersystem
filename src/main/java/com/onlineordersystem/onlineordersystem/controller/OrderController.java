package com.onlineordersystem.onlineordersystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlineordersystem.onlineordersystem.entity.Order;
import com.onlineordersystem.onlineordersystem.service.Orders.OrdersService;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    OrdersService ordersService;

    @GetMapping("/add")
    public String addOrders(List<Order> orders) {
        ordersService.addOrders(orders);
        return "Successfully added !!";
    }

    @GetMapping("/pendingOrders")
    public List<Order> getAllPendingOrders() {
        return ordersService.getAllPendingOrders();
    }

    @GetMapping("/{orderId}")
    public Order getOrder(@PathVariable int orderId)
    {
        return ordersService.getOrder(orderId);
    }

}
