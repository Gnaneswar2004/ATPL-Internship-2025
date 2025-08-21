package com.aaslin.orderManagement.controller;

import com.aaslin.orderManagement.entity.Order;
import com.aaslin.orderManagement.service.OrderService;
import com.aaslin.orderManagement.service.ProductService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/orders")
public class OrderController {
	
	private final OrderService orderService;
	private final ProductService productService;

	public OrderController(OrderService orderService, ProductService productService) {
		this.orderService = orderService;
		this.productService = productService;
	}

	@GetMapping("/add")
	public String showAddOrderForm(Model model) {
		model.addAttribute("order", new Order());
		model.addAttribute("products", productService.getAllProducts());
		return "addOrder";
	}

	@PostMapping("/add")
	public String addOrder(@ModelAttribute Order order) {
		orderService.addOrder(order);
		return "redirect:/orders/list";
	}

	@GetMapping("/update")
	public String showUpdateOrderForm(@PathVariable int id, Model model) {
		Order order = orderService.getOrderById(id);
		if (order == null) return "redirect:/orders/list";
		model.addAttribute("order", order);
		model.addAttribute("orders", orderService.getAllOrders());
		return "updateOrder";
	}

	@PostMapping("/update")
	public String updateOrder(@PathVariable int id, @ModelAttribute Order order) {
		orderService.updateOrder(id, order);
		return "redirect:/orders/list";
	}

	@PostMapping("/cancel")
	public String cancelOrder(@PathVariable int id) {
		orderService.cancelOrder(id);
		return "redirect:/orders/list";
	}

	@GetMapping("/list")
	public String getAllOrders(Model model) {
		model.addAttribute("orders", orderService.getAllOrders());
		return "orders";
	}
}