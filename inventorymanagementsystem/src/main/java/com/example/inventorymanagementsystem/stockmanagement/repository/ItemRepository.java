package com.example.inventorymanagementsystem.stockmanagement.repository;

import com.example.inventorymanagementsystem.stockmanagement.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ItemRepository {
    ArrayList<Item> getItems();
    Item getItemById(Long itemId);
    Item addItem(Item item) ;
    Item updateItem(Long itemId, Item item);
    void deleteItem(Long itemId);
}


