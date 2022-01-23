package com.mycompany.bakery.models;

public class Order {

    private String Username;
    private int Quantity;    
    private String BakedItem;
    private double Price;

    public Order(String Username, int Quantity, String BakedItem, double Price) {
        this.Username = Username;
        this.Quantity = Quantity;
        this.BakedItem = BakedItem;
        this.Price = Price;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
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
