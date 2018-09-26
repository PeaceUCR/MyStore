package com.example.demo.controller;

import com.example.demo.model.Item;
import com.example.demo.model.ItemCategory;
import com.example.demo.service.ItemCategoryService;
import com.example.demo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/items")
public class ItemController {
    @Autowired
    ItemService itemService;

    @Autowired
    ItemCategoryService itemCategoryService;

    //add or edit
    //@RequestMapping(value = "/add", method = RequestMethod.POST,consumes = "application/json; charset=utf-8")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addItem(@RequestBody Item item){
        System.out.println("add item");
        itemService.addItem(item);
    }

    //@RequestMapping(value = "/getAll", method = RequestMethod.GET,produces = "application/json; charset=utf-8")
    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<Item> getAllItems(){
        System.out.println("get items");
        return itemService.getAllItems();
    }

    @RequestMapping(value = "/getByCategory", method = RequestMethod.GET)
    public List<Item> getByCategory(@RequestParam("category") String category){
        System.out.println("get category: "+category);
        ItemCategory itemCategory = itemCategoryService.getByName(category);
        System.out.println("get category: "+itemCategory);
        return itemService.findAllByItemCategoryContains(itemCategory);
        //return itemService.getAllItemsBetweenTime(data.get("start"),data.get("end"));
    }
    /*
    @RequestMapping(value = "/getAllBetween", method = RequestMethod.POST)
    public List<Item> getAllItemsBetweenTime(@RequestBody Map<String, String> data){
        System.out.println("get items between");
        return itemService.getAllItemsBetweenTime(data.get("start"),data.get("end"));
    }


    @RequestMapping(value = "/searchByName", method = RequestMethod.GET)
    public List<Item> searchByName(@RequestParam("name") String name){
        System.out.println("searchby name");
        return itemService.searchItemsByName(name);
    }
    */

    //https://stackoverflow.com/questions/17964841/how-to-get-param-in-method-post-spring-mvc
    //https://stackoverflow.com/questions/4007969/application-x-www-form-urlencoded-or-multipart-form-data
    //https://stackoverflow.com/questions/42137224/neither-requestbody-nor-requestparam-work
    //https://stackoverflow.com/questions/28039709/what-is-difference-between-requestbody-and-requestparam
    //@RequestMapping(value = "/delete", method = RequestMethod.DELETE,consumes = "application/json; charset=utf-8")

    //method delete here has problem in cors token based 403, pending, post for test
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public void deletItem(@RequestBody Map<String, String> data){
        System.out.println("delete item");
        itemService.deleteItem(data.get("id"));
    }
}
