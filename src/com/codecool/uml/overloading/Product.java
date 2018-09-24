package com.codecool.uml.overloading;

import java.util.ArrayList;


public class Product{

    protected int id;
    private String name;
    private float defaultPrice;
    private String defaultCurrency;
    private ProductCategory productCategory;
    private Supplier supplier;
    private ArrayList<Product> productList= new ArrayList<Product>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getDefaultPrice() {
        return defaultPrice;
    }

    public void setDefaultPrice(float defaultPrice) {
        this.defaultPrice = defaultPrice;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getDefaultCurrency() {
        return defaultCurrency;
    }

    public void setDefaultCurrency(String defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }


    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public ArrayList<ProductCategory> getAllProductBy(ProductCategory productCategory){
        return null;
    }

    public ArrayList<Supplier> getAllProductBy(Supplier supplier){
        return null;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public String toString(){
        String result = "Product name:" + this.name + " id:" + this.id +" price:" + this.defaultPrice + defaultCurrency;
        return result;
    }
}
