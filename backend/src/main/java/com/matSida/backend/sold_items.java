package com.matsida.backend;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity // This tells Hibernate to make a table out of this class
public class sold_items {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String user;

    private String item;

    private Date sell_date;

    private Date bad_date;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Date getSellDate() {
        return sell_date;
    }

    public void setSellDate(Date sell_date) {
        this.sell_date = sell_date;
    }

    public Date getBadDate() {
        return bad_date;
    }

    public void setBadDate(Date bad_date) {
        this.bad_date = bad_date;
    }
}