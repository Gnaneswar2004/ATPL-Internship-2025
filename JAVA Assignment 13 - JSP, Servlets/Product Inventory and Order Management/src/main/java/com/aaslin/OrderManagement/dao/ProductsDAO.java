package com.aaslin.OrderManagement.dao;

import com.aaslin.OrderManagement.model.Product;
import java.util.List;

public interface ProductsDAO {
	
    boolean addProduct(Product product);
    
    List<Product> getAllProducts();
    
    boolean updateProduct(int productId, int quantity, String is_active, String updated_by);
}