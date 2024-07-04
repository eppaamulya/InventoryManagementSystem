package com.example.inventorymanagementsystem.stockmanagement.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;

import com.example.inventorymanagementsystem.stockmanagement.model.Item;
import com.example.inventorymanagementsystem.stockmanagement.service.StockJpaService;


@RestController
public class StockController {

    @Autowired
    private StockJpaService stockJpaService;

    @GetMapping("/items")
    public ArrayList<Item> getItems(){
        return stockJpaService.getItems();
    }

    @GetMapping("/items/{itemId}")
    public Item getItemById(@PathVariable("itemId") Long itemId) {
        return stockJpaService.getItemById(Long itemId);
    }

    @PostMapping("/items")
    public Item addItem(@RequestBody Item item) {
        return stockJpaService.addItem(item);
    }

    @PutMapping("/items/{itemId}")
    public Item updateItem(@PathVariable("itemId") Long itemId, @RequestBody Item item) {
        return stockJpaService.updateItem(itemId, item);
    }

    @DeleteMapping("/items/{itemId}")
    public void deleteItem(@PathVariable("itemId") Long itemId){
        stockJpaService.deleteItem(itemId);
    }

}