package com.example.demo.controller;


import com.example.demo.model.ItemCategory;
import com.example.demo.service.ItemCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/category")
public class ItemCategoryController {

    @Autowired
    ItemCategoryService itemCategoryService;

    //add or edit
    //@RequestMapping(value = "/add", method = RequestMethod.POST,consumes = "application/json; charset=utf-8")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addItem(@RequestBody ItemCategory itemCategory){
        System.out.println("add category");
        itemCategoryService.addItemCategory(itemCategory);
    }

    //@RequestMapping(value = "/getAll", method = RequestMethod.GET,produces = "application/json; charset=utf-8")
    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<ItemCategory> getAllItems(){
        System.out.println("get categorys");
        return itemCategoryService.getAllItemCategory();
    }


    //https://stackoverflow.com/questions/17964841/how-to-get-param-in-method-post-spring-mvc
    //https://stackoverflow.com/questions/4007969/application-x-www-form-urlencoded-or-multipart-form-data
    //https://stackoverflow.com/questions/42137224/neither-requestbody-nor-requestparam-work
    //https://stackoverflow.com/questions/28039709/what-is-difference-between-requestbody-and-requestparam
    //@RequestMapping(value = "/delete", method = RequestMethod.DELETE,consumes = "application/json; charset=utf-8")
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void deletItem(@RequestBody Map<String, String> data){
        System.out.println("delete category");
        itemCategoryService.deleteItemCategory(data.get("id"));
    }
}
