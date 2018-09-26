package com.example.demo.model;

import org.springframework.data.annotation.Id;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Item extends AbstractDomainClass {

    public String name;

    public String brand;

    public String price;

    public int quantity;
    //https://stackoverflow.com/questions/48424575/how-to-search-through-array-in-spring-boot-crudrepository
    /*May be only use for sql db
    //@ElementCollection
    private List<ItemCategory> itemCategory;
    */
    //can't be list here because js array can't convert to list
    public ItemCategory[] itemCategory;

    public String[] specifications;

    public String[] attachmentUrls;

    public Item() {
    }


    public Item(String name, String brand, String price, int quantity, ItemCategory[] itemCategory, String[] specifications, String[] attachmentUrls) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
        this.itemCategory = itemCategory;
        this.specifications = specifications;
        this.attachmentUrls = attachmentUrls;
    }


    public Item( String id,String name, String brand, String price, int quantity, ItemCategory[] itemCategory, String[] specifications, String[] attachmentUrls) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
        this.itemCategory = itemCategory;
        this.specifications = specifications;
        this.attachmentUrls = attachmentUrls;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price='" + price + '\'' +
                ", quantity=" + quantity +
                ", itemCategory=" + Arrays.toString(itemCategory) +
                ", specifications=" + Arrays.toString(specifications) +
                ", attachmentUrls=" + Arrays.toString(attachmentUrls) +
                ", id='" + id + '\'' +
                ", version=" + version +
                ", dateCreated=" + dateCreated +
                ", lastUpdated=" + lastUpdated +
                '}';
    }
}
