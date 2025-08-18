package com.aaslin.SpringMVC.ProductInventory.controller;

import com.aaslin.SpringMVC.ProductInventory.model.Product;
import com.aaslin.SpringMVC.ProductInventory.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return service.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable int id) {
        return service.getProductById(id);
    }

    @PostMapping
    public ResponseEntity<Product> addProduct(@Valid @RequestBody Product product) {
        return ResponseEntity.ok(service.addProduct(product));
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable int id, @Valid @RequestBody Product product) {
        return service.updateProduct(id, product);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable int id) {
        service.deleteProduct(id);
        return ResponseEntity.ok("Product deleted successfully");
    }
}