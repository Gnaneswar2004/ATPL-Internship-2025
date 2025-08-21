package com.aaslin.orderManagement.service;

import com.aaslin.orderManagement.entity.Product;
import java.util.List;

public interface ProductServices {
    Product addProduct(Product product);
    Product getProductById(int id);
    Product updateProduct(int id, Product product);
    void deleteProduct(int id);
    List<Product> getAllProducts();
}