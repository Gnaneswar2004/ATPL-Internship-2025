package com.aaslin.orderManagement.service;

import com.aaslin.orderManagement.entity.Order;
import java.util.List;

public interface OrderServices {
    Order addOrder(Order order);
    Order getOrderById(int id);
    Order updateOrder(int id, Order order);
    void cancelOrder(int id);
    List<Order> getAllOrders();
}