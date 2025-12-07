package com.onlineordersystem.onlineordersystem.service.Orders;

import java.util.List;

import com.onlineordersystem.onlineordersystem.entity.Order;

public interface OrdersService {
    public List<Order> getAllPendingOrders();
    public Order getOrder(int orderId);
    public String addOrders(List<Order> orders);
}
