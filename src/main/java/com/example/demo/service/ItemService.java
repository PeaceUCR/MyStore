package com.example.demo.service;

import com.example.demo.model.Item;
import com.example.demo.model.ItemCategory;
import com.example.demo.repository.ItemRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    public ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository){
        this.itemRepository = itemRepository;
    }

    //    //add or edit(if exist)
    public void addItem(Item item){
        //preupdate annotation not support, call manually
        item.updateTimeStamps();
        itemRepository.save(item);
    }

    public List<Item> getAllItems(){
        return itemRepository.findAll();
        //https://stackoverflow.com/questions/16608102/spring-data-mongorepository-query-sort
       //return itemRepository.findAll(new Sort(Sort.Direction.DESC, "dateAdded"));
        //return  itemRepository.findAllByOrderByDateAddedDesc();
    }
    /*
    public List<Item> getAllItemsBetweenTime(String start, String end){
        return itemRepository.findAllByDateAddedBetweenOrderByDateAddedDesc(start, end);
    }

    public List<Item> searchItemsByName(String name){
        return itemRepository.findAllByNameContainsOrderByDateAddedDesc(name);
    }
    */

    public List<Item> findAllByItemCategoryContains(ItemCategory itemCategory){
        return itemRepository.findAllByItemCategoryContains(itemCategory);
    }
    public void deleteItem(String id){
       itemRepository.deleteItemById(id);
    }

}
