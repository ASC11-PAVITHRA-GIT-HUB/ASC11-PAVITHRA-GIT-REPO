package com.ecz.model;

public class Product {
    private String id;
    private String name;
    private double price;
    private int quantity;

    public Product(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()==0) {
            RuntimeException nameInvalidException = new RuntimeException("The name cannot be empty!");
            throw nameInvalidException;
        }

    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getquantity() {
        return quantity;
    }
    public void setquantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return "Product Details : " +
                "id = " + id + "\t" +
                "name = " + name + "\t" +
                "price = " + price + "\t" +
                "quantity = " + quantity;
    }
}