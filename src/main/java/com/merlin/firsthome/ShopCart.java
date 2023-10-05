package com.merlin.firsthome;

import java.util.ArrayList;
import java.util.List;

public class ShopCart {

    private List<Product> products;
    private double saveMoney;

    public ShopCart() {
        products = new ArrayList<>();
        saveMoney = 0.0;
    }

    public void addProduct(Product product) 
    {
        products.add(product);
    }

    public void addMoney(double money) {
        if (products.isEmpty()) {
            return; // Nincsenek tételek a listában
        }

        double share = money / products.size();
        saveMoney += share;

        for (Product product : products) {
            product.addSavedMoney(share);
        }
    }
    public List<Product> getProducts() {
        return products;
    }
    public double getSavedPercentage(Product product) 
    {
        return (product.getSaveMoney() / product.getPrice()) * 100.0;
    }
    public void removeItemIfComplete(Product product) 
    {
        if (getSavedPercentage(product) >= 100.0) 
        {
            products.remove(product);
        }
    }
    


}
