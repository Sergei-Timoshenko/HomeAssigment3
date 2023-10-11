package com.myapp.entities;

public class Product {
    private final String productName;
    private double price = .1;
    private int count;
    private static double allProductPrice;

    public Product(String productName) {
        this.productName = productName;
    }

    public void showProductName() {
        System.out.println(productName);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public static void addAllProducts(int count, double price) {
        allProductPrice += count * price;
    }

    public static void showAllProductPrice() {
        System.out.println(allProductPrice);
    }
}
