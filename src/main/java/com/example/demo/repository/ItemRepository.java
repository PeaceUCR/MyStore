package com.example.demo.repository;

import com.example.demo.model.Item;

import com.example.demo.model.ItemCategory;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface ItemRepository extends MongoRepository<Item, String> {

    public List<Item> findAll();


    public List<Item> findAllByItemCategoryContains(ItemCategory itemCategory);

    //https://stackoverflow.com/questions/16608102/spring-data-mongorepository-query-sort
    //return itemRepository.findAll(new Sort(Sort.Direction.DESC, "dateAdded"));
    //use this way in service
    //https://stackoverflow.com/questions/20374437/jpa-query-creation-order-by
    //public List<Item> findAllByOrderByDateAddedDesc();

    /*
    public List<Item> findAllByDateAddedBetweenOrderByDateAddedDesc(String startdate, String enddate);


    public List<Item> findAllByNameContainsOrderByDateAddedDesc(String name);
    */
    //return the number deleted
    public String deleteItemById(String id);

}
