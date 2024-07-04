package com.example.inventorymanagementsystem.orderfulfillment.repository;

import com.example.inventorymanagementsystem.orderfulfillment.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface OrderRepository {
    ArrayList<Order> getOrders();
    Order getOrderById(Long orderId);
    Order addOrder(Order order) ;
    Order updateOrder(Long orderId, Order order);
    void deleteOrder(Long orderId);
}