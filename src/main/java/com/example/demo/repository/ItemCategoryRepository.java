package com.example.demo.repository;

import com.example.demo.model.ItemCategory;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ItemCategoryRepository extends MongoRepository<ItemCategory, String> {

    public List<ItemCategory> findAll();

    public String deleteItemCategoryById(String id);

    public ItemCategory findItemCategoryByName(String name);
}
