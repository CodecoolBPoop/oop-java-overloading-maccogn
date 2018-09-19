package com.codecool.uml.overloading;

import java.util.ArrayList;

public class ProductCategory extends Product{
    protected int id;
    private String name;
    private String departman;
    private String description;

    public void ProductCategory(){

    }

    public void ProductCategory(String name, String departman, int id){
        this.name = name;
        this.departman = departman;
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

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Product> getProduct(){
        return null;
    }


    @Override
    public String toString(){
        String result = "Product name:" + this.name + " id:" + this.id +" Description" + this.description+ " Department:" + this.departman;
        return result;
    }
}
