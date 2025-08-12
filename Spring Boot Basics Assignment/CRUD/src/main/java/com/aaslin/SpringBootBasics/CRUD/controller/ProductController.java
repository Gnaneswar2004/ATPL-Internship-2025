package com.aaslin.SpringBootBasics.CRUD.controller;

import com.aaslin.SpringBootBasics.CRUD.model.Product;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    private Map<Long, Product> productDB = new HashMap<>();

    // Add product
    @PostMapping
    public String addProduct(@RequestBody Product product) {
        productDB.put(product.getId(), product);
        return "Product added successfully!";
    }

    // List all products
    @GetMapping
    public List<Product> listProducts() {
        return new ArrayList<>(productDB.values());
    }

    // Update product
    @PutMapping("/{id}")
    public String updateProduct(@PathVariable Long id, @RequestBody Product product) {
        if (!productDB.containsKey(id)) {
            return "Product not found!";
        }
        product.setId(id);
        productDB.put(id, product);
        return "Product updated successfully!";
    }

    // Delete product
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Long id) {
        if (!productDB.containsKey(id)) {
            return "Product not found!";
        }
        productDB.remove(id);
        return "Product deleted successfully!";
    }
}