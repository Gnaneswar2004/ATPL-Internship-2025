package com.aaslin.SpringMVC.ProductInventory.service;

import com.aaslin.SpringMVC.ProductInventory.exception.ResourceNotFoundException;
import com.aaslin.SpringMVC.ProductInventory.model.Product;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductService {

    private final Map<Integer, Product> productStore = new HashMap<>();
    private int nextId = 1;

    public List<Product> getAllProducts() {
        return new ArrayList<>(productStore.values());
    }

    public Product getProductById(int id) {
        Product product = productStore.get(id);
        if (product == null) {
            throw new ResourceNotFoundException("Product not found with id " + id);
        }
        return product;
    }

    public Product addProduct(Product product) {
        product.setId(nextId++);
        productStore.put(product.getId(), product);
        return product;
    }

    public Product updateProduct(int id, Product updatedProduct) {
        if (!productStore.containsKey(id)) {
            throw new ResourceNotFoundException("Product not found with id " + id);
        }
        updatedProduct.setId(id);
        productStore.put(id, updatedProduct);
        return updatedProduct;
    }

    public void deleteProduct(int id) {
        if (!productStore.containsKey(id)) {
            throw new ResourceNotFoundException("Product not found with id " + id);
        }
        productStore.remove(id);
    }
}