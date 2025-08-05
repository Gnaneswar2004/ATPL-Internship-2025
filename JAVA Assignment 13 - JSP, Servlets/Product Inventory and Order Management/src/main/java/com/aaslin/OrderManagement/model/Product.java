package com.aaslin.OrderManagement.model;

import java.util.Date;

public class Product {
	private int product_id;
	private String name;
	private double price;
	private int stock_quantity;
	private boolean is_active;
	private Date created_date;
	private String created_by;
	private Date updated_date;
	private String updated_by;
	
	public Product(String name, double price, int stock_quantity, String created_by) {
		super();
		this.name = name;
		this.price = price;
		this.stock_quantity = stock_quantity;
		this.created_by = created_by;
	}
	
	public Product(int product_id, int stock_quantity, boolean is_active, String updated_by) {
		super();
		this.product_id = product_id;
		this.stock_quantity = stock_quantity;
		this.is_active = is_active;
		this.updated_by = updated_by;
	}

	public Product(int product_id, String name, double price, int stock_quantity, boolean is_active, Date created_date,
			String created_by, Date updated_date, String updated_by) {
		super();
		this.product_id = product_id;
		this.name = name;
		this.price = price;
		this.stock_quantity = stock_quantity;
		this.is_active = is_active;
		this.created_date = created_date;
		this.created_by = created_by;
		this.updated_date = updated_date;
		this.updated_by = updated_by;
	}

	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
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
	public int getStock_quantity() {
		return stock_quantity;
	}
	public void setStock_quantity(int stock_quantity) {
		this.stock_quantity = stock_quantity;
	}
	public boolean isIs_active() {
		return is_active;
	}
	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}
	public Date getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public Date getUpdated_date() {
		return updated_date;
	}
	public void setUpdated_date(Date updated_date) {
		this.updated_date = updated_date;
	}
	public String getUpdated_by() {
		return updated_by;
	}
	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}
	@Override
	public String toString() {
		return "Product [product_id = " + product_id + ", name = " + name + ", price = " + price + ", stock_quantity = "
				+ stock_quantity + ", is_active = " + is_active + ", created_date = " + created_date + ", created_by = "
				+ created_by + ", updated_date = " + updated_date + ", updated_by = " + updated_by + "]";
	}
}