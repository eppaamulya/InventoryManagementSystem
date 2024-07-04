package com.example.inventorymanagementsystem.stockmanagement.service;

import com.example.inventorymanagementsystem.stockmanagement.repository.ItemRepository;
import com.example.inventorymanagementsystem.stockmanagement.repository.ItemJpaRepository;
import com.example.inventorymanagementsystem.stockmanagement.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StockJpaService implements ItemRepository{
    @Autowired
    private ItemJpaRepository itemJpaRepository;


    @Override
    public void deleteBook(Long itemId) {
        try {

            itemJpaRepository.deleteById(bookId);
        } catch (Exception e) {

            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

    }

    @Override
    public Item updateItem(Long itemId, Item item) {
        try {
            Item newItem =itemJpaRepository.findById(itemId).get();
            if (item.getName() != null) {
                newItem.setName(item.getName());
            }
            if (item.getDescription() != null) {
                newItem.setDescription(item.getDescription());
            }
            if (item.getPrice() != null) {
                newItem.setPrice(item.getPrice());
            }
            if (item.getQuantity() != null) {
                newItem.setQuantity(item.getQuantity());
            }
            itemJpaRepository.save(newItem);

            return newItem;

        } catch(Exception e){

            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

    }

    @Override
    public Item addItem(Item item) {

        itemJpaRepository.save(item);
        return item;
    }

    @Override
    public Item getItemById(Long itemId) {

        try{

            Item item = itemJpaRepository.findById(itemId).get();
            return item;
        }
        catch(Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ArrayList<Item> getItems() {
        List<Item> itemList = itemJpaRepository.findAll();
        ArrayList<Item> items = new ArrayList<>(itemList);
        return items;
    }




//    @Override
//    public Item addItem(Item item) {
//        return itemJpaRepository.save(item);
//    }
//
//    @Override
//    public Item updateItem(Long itemId, Item item) {
//        return itemRepository.findById(itemId).map(item -> {
//            item.setName(updatedItem.getName());
//            item.setDescription(updatedItem.getDescription());
//            item.setPrice(updatedItem.getPrice());
//            item.setQuantity(updatedItem.getQuantity());
//            return itemJpaRepository.save(item);
//        }).orElseThrow(() -> new ResourceNotFoundException("Item not found"));
//    }
//
//    @Override
//    public void deleteItem(Long itemId) {
//        itemJpaRepository.deleteById(id);
//    }
//
//    @Override
//    public Item getItemById(Long itemId) {
//        return itemJpaRepository.findById(itemId).orElseThrow(() -> new ResourceNotFoundException("Item not found"));
//    }
//
//    @Override
//    public ArrayList<Item> getItems() {
//        return itemJpaRepository.findAll();
//    }
}
