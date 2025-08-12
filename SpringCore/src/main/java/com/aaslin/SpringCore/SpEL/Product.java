package com.aaslin.SpringCore.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Product {

    @Value("Laptop")
    private String name;

    @Value("60000.0")
    private double price;

    @Value("#{60000.0 - (60000.0 * 0.10)}") // 10% discount
    private double discountedPrice;

    @Value("true")
    private boolean inStock;

    @Value("#{${inStock:true} ? 'Available in stock' : 'Currently unavailable'}")
    private String availabilityMessage;

    public void printDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Original Price: ₹" + price);
        System.out.println("Discounted Price: ₹" + discountedPrice);
        System.out.println("In Stock: " + inStock);
        System.out.println("Availability Message: " + availabilityMessage);
    }
}