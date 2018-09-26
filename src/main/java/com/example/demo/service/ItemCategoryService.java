package com.example.demo.service;

import com.example.demo.model.Item;
import com.example.demo.model.ItemCategory;
import com.example.demo.repository.ItemCategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemCategoryService {

    public ItemCategoryRepository itemCategoryRepository;

    public ItemCategoryService(ItemCategoryRepository itemCategoryRepository){
        this.itemCategoryRepository = itemCategoryRepository;
    }

    //    //add or edit(if exist)
    public void addItemCategory(ItemCategory itemCategory){
        //preupdate annotation not support, call manually
        itemCategory.updateTimeStamps();
        itemCategoryRepository.save(itemCategory);
    }

    public List<ItemCategory> getAllItemCategory(){
        return itemCategoryRepository.findAll();
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

    public ItemCategory getByName(String name){
        return  itemCategoryRepository.findItemCategoryByName(name);
    }
    public void deleteItemCategory(String id){
        itemCategoryRepository.deleteItemCategoryById(id);
    }

}
