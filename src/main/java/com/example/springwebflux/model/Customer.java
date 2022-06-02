package com.example.springwebflux.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//@Document("CUSTOMERDETAILS")
public class Customer {
    @Id
    private String id;

    private int no;
    private String name;

    public Customer(String id, int no, String name) {

        this.id = id;
        this.no = no;
        this.name = name;
    }


    public Customer(){}

    public String getId() {
        return id;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
