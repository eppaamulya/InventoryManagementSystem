package com.example.inventorymanagementsystem.orderfulfillment.repository;

import com.example.inventorymanagementsystem.orderfulfillment.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderJpaRepository extends JpaRepository<Order, Long> {
}
