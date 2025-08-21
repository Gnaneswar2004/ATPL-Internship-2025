package com.aaslin.orderManagement.controller;

import com.aaslin.orderManagement.entity.Product;
import com.aaslin.orderManagement.service.ProductService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/products")
public class ProductController {
	private final ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@GetMapping("/add")
	public String showAddProductForm(Model model) {
		model.addAttribute("product", new Product());
		model.addAttribute("products", productService.getAllProducts());
		return "addProduct";
	}

	@PostMapping("/add")
	public String addProduct(@ModelAttribute Product product) {
		productService.addProduct(product);
		return "redirect:/products/list";
	}

	@GetMapping("/update")
	public String showUpdateProductForm(@PathVariable int id, Model model) {
		Product product = productService.getProductById(id);
		if (product == null) return "redirect:/products/list";
		model.addAttribute("product", product);
		return "updateProduct";
	}

	@PostMapping("/update")
	public String updateProduct(@PathVariable int id, @ModelAttribute Product product) {
		productService.updateProduct(id, product);
		return "redirect:/products/list";
	}

	@PostMapping("/delete")
	public String deleteProduct(@PathVariable int id) {
		productService.deleteProduct(id);
		return "redirect:/products/list";
	}

	@GetMapping("/list")
	public String getAllProducts(Model model) {
		model.addAttribute("products", productService.getAllProducts());
		return "products";
	}
}