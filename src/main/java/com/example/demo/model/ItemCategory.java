package com.example.demo.model;

public class ItemCategory extends AbstractDomainClass {


    public ItemCategory() {
    }

    public ItemCategory(String name) {
        this.name = name;
    }

    public ItemCategory(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    // use for compare in repo
    //https://stackoverflow.com/questions/2642589/how-does-a-arraylists-contains-method-evaluate-objects
    @Override
    public boolean equals(Object object) {
        System.out.println("item category equals called");

        boolean sameSame = false;

        if (object != null && object instanceof ItemCategory)
        {
            sameSame = this.name == ((ItemCategory) object).name;
        }

        return sameSame;
    }

    @Override
    public String toString() {
        return "ItemCategory{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", version=" + version +
                ", dateCreated=" + dateCreated +
                ", lastUpdated=" + lastUpdated +
                '}';
    }
}
