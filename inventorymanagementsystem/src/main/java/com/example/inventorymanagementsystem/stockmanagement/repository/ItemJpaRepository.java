package com.example.inventorymanagementsystem.stockmanagement.repository;

import com.example.inventorymanagementsystem.stockmanagement.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
