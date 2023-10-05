package com.merlin.firsthome;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FirstHome
{
    
    public static void main(String[] args) 
    {
        List<Product>products = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        ShopCart shopcart = new ShopCart();

        Product item1 = new Product("Laptop", 1000);
        Product item2 = new Product("Smartphone", 500);

        shopcart.addProduct(item1);
        shopcart.addProduct(item2);

        shopcart.addMoney(400.0);
        shopcart.addMoney(600.0);

        for (Product item : shopcart.getProducts()) {
            double savedPercentage = shopcart.getSavedPercentage(item);
            System.out.println("Tétel: " + item.getName() + ", Ár: " + item.getPrice() + ", Megvásárolva " + savedPercentage + "%");

          
        }
    }
}

