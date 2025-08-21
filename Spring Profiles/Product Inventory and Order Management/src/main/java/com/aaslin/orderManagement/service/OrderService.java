package com.aaslin.orderManagement.service;

import com.aaslin.orderManagement.entity.Order;
import com.aaslin.orderManagement.repository.OrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Transactional
public class OrderService implements OrderServices {
	
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	@Override
    public Order addOrder(Order order) {
        order.setActive(true);
        order.setCreatedDate(LocalDateTime.now());
        order.setCreatedBy("");
        return orderRepository.save(order);
    }

    @Override
    @Transactional(readOnly = true)
    public Order getOrderById(int id) {
        return orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Order not found with id: " + id));
    }

    @Override
    public Order updateOrder(int id, Order updatedOrder) {
        Order existing = getOrderById(id);
        existing.setProductId(updatedOrder.getProductId());
        existing.setQuantity(updatedOrder.getQuantity());
        existing.setUpdatedDate(LocalDateTime.now());
        existing.setUpdatedBy("");
        return orderRepository.save(existing);
    }

    @Override
    public void cancelOrder(int id) {
        Order existing = getOrderById(id);
        existing.setActive(false);
        existing.setUpdatedDate(LocalDateTime.now());
        existing.setUpdatedBy("");
        orderRepository.save(existing);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Order> getAllOrders() {
        return orderRepository.findAll().stream().filter(Order::isActive).toList();
    }
}