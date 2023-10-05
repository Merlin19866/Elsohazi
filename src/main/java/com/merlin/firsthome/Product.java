package com.merlin.firsthome;

public class Product 
{
    private String name;
    private int price;
    private double savemoney;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
        
        savemoney=0.0;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public double getSaveMoney() {
        return savemoney;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setSmoney(int smoney) {
        this.savemoney = smoney;
    }
    public void addSavedMoney(double money)
    {
        savemoney +=money;
    }
    
}
