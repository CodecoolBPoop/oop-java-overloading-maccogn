package com.codecool.uml.overloading;

import java.util.ArrayList;

public class Supplier {
    protected int id;
    private String name;
    private String description;

    public Supplier(String name, String description){
        this.name = name;
        this.description = description;
        this.id += 1;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Product> getProducts(){
        return null;
    }

    public String toString(){
        String result = "Id: " + this.id + "\n Name: " + this.name + " \n Description: \n" + this.description;
        return result;
    }
}
