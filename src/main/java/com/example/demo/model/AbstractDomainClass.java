package com.example.demo.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;

import java.util.Date;

//mongodb doesn't has annotations in sql db
public class AbstractDomainClass {


    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    public String id;

    @Version
    public Integer version;

    public Date dateCreated;

    public Date lastUpdated;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void updateTimeStamps() {
        lastUpdated = new Date();
        if (dateCreated==null) {
            dateCreated = new Date();
        }
    }
}
