package com.example.springwebflux.model;

public class Services {
    String name;
    String type;
    Network [] network;

    public Services(String name, String type, Network[] network) {
        this.name = name;
        this.type = type;
        this.network = network;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Network[] getNetwork() {
        return network;
    }

    public void setNetwork(Network[] network) {
        this.network = network;
    }
}
