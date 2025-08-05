package com.aaslin.OrderManagement.dao;

import com.aaslin.OrderManagement.model.Order;
import java.util.List;

public interface OrdersDAO {
	
    boolean addOrder(Order order);
    
    List<Order> getAllOrders();
    
    boolean updateOrder(int order_id, String status, String updatedBy);
}