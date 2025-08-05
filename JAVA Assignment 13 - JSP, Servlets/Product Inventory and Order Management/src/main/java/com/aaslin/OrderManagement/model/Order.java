package com.aaslin.OrderManagement.model;

import java.util.Date;

public class Order {
	private int order_id;
	private int product_id;
	private int quantity;
	private String customer_name;
	private Date order_date;
	private String status;
	private boolean is_active;
	private Date created_date;
	private String created_by;
	private Date updated_date;
	private String updated_by;
	
	public Order(int product_id, int quantity, String customer_name, String created_by) {
		super();
		this.product_id = product_id;
		this.quantity = quantity;
		this.customer_name = customer_name;
		this.created_by = created_by;
	}
	
	public Order(int order_id, int product_id, int quantity, String customer_name, String status, String is_active, String updated_by) {
		super();
		this.order_id = order_id;
		this.product_id = product_id;
		this.quantity = quantity;
		this.customer_name = customer_name;
		this.status = status;
		this.is_active = Boolean.parseBoolean(is_active);
		this.updated_by = updated_by;
	}

	public Order(int order_id, int product_id, int quantity, String customer_name, Date order_date, String status,
			boolean is_active, Date created_date, String created_by, Date updated_date, String updated_by) {
		super();
		this.order_id = order_id;
		this.product_id = product_id;
		this.quantity = quantity;
		this.customer_name = customer_name;
		this.order_date = order_date;
		this.status = status;
		this.is_active = is_active;
		this.created_date = created_date;
		this.created_by = created_by;
		this.updated_date = updated_date;
		this.updated_by = updated_by;
	}

	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public Date getOrder_date() {
		return order_date;
	}
	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
		return "Order [order_id = " + order_id + ", product_id = " + product_id + ", quantity = " + quantity
				+ ", customer_name = " + customer_name + ", order_date = " + order_date + ", status = " + status
				+ ", is_active = " + is_active + ", created_date = " + created_date + ", created_by = " + created_by
				+ ", updated_date = " + updated_date + ", updated_by = " + updated_by + "]";
	}
	
}