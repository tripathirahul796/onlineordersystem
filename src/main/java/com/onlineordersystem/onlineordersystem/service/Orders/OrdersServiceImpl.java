package com.onlineordersystem.onlineordersystem.service.Orders;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineordersystem.onlineordersystem.entity.Order;
import com.onlineordersystem.onlineordersystem.repository.OrderRepo;

@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    OrderRepo orderRepo;


    @Override
    public List<Order> getAllPendingOrders() {
      return orderRepo.findByStatus(1);
    }

    @Override
    public Order getOrder(int orderId) {
        return orderRepo.findById(orderId).get();
    }

    @Override
    public String addOrders(List<Order> orders) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addOrders'");
    }
    
}
