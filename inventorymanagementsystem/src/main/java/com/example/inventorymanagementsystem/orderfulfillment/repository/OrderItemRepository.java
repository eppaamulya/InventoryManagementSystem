package com.example.inventorymanagementsystem.orderfulfillment.repository;

import com.example.inventorymanagementsystem.orderfulfillment.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface OrderItemRepository {
    ArrayList<OrderItem> getOrderItems();

    OrderItem getOrderItemById(Long orderItemId);

    OrderItem addOrderItem(OrderItem orderItem);

    OrderItem updateOrderItem(Long orderItemId, OrderItem orderItem);

    void deleteOrderItem(Long orderItemId);
}