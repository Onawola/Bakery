package com.mycompany.bakery.models;

public class Stock {

    private int Quantity;    
    private String BakedItem;
    private double Price;

    public Stock(int Quantity, String BakedItem, double Price) {
        this.Quantity = Quantity;
        this.BakedItem = BakedItem;
        this.Price = Price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public String getBakedItem() {
        return BakedItem;
    }

    public void setBakedItem(String BakedItem) {
        this.BakedItem = BakedItem;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }      
}
