package com.aaslin.SpringMVC.ProductInventory.model;

import jakarta.validation.constraints.*;

public class Product {

    private int id;

    @NotBlank(message = "Product name is required")
    private String name;

    @PositiveOrZero(message = "Price must be Positive")
    private double price;

    @Min(value = 0, message = "Quantity must be >= 0")
    private int quantity;

    public Product() {}

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}