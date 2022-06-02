package com.example.springwebflux.model;

import org.springframework.data.annotation.Id;

public class Network {

    String type;
    String costType;
    String cost;

    public Network(String type, String costType, String cost) {
        this.type = type;
        this.costType = costType;
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCostType() {
        return costType;
    }

    public void setCostType(String costType) {
        this.costType = costType;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
