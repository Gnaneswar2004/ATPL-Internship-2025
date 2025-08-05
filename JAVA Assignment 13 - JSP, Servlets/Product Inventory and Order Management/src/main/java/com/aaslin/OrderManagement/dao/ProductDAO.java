package com.aaslin.OrderManagement.dao;

import com.aaslin.OrderManagement.model.Product;
import com.aaslin.OrderManagement.util.DBConnection;

import java.sql.*;
import java.util.*;

public class ProductDAO implements ProductsDAO {

    @Override
    public boolean addProduct(Product product) {
        String query = "INSERT INTO products_gnani (name, price, stock_quantity, created_date, created_by, updated_date, updated_by) VALUES (?, ?, ?, NOW(), ?, NOW(), ?)";
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

        	statement.setString(1, product.getName());
        	statement.setDouble(2, product.getPrice());
        	statement.setInt(3, product.getStock_quantity());
        	statement.setString(4, product.getCreated_by());
        	statement.setString(5, product.getCreated_by());

            statement.executeUpdate();
            statement.close();
            connection.close();
            return true;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        String query = "SELECT * FROM products_gnani WHERE is_active = 1";

        try (Connection connection = DBConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet result = statement.executeQuery(query)) {

            while (result.next()) {
                products.add(new Product(
	                result.getInt("product_id"),
	                result.getString("name"),
	                result.getDouble("price"),
	                result.getInt("stock_quantity"),
	                result.getBoolean("is_active"),
	                result.getTimestamp("created_date"),
	                result.getString("created_by"),
	                result.getTimestamp("updated_date"),
	                result.getString("updated_by")
                ));
            }
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }

    @Override
    public boolean updateProduct(int productId, int quantity, String is_active, String updated_by) {
    	
        String query = "UPDATE products_gnani SET stock_quantity = ?, is_active = ?, updated_date = NOW(), updated_by = ? WHERE product_id = ?";
        
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

        	statement.setInt(1, quantity);
        	statement.setInt(2, "true".equals(is_active) ? 1 : 0);
        	statement.setString(3, updated_by);
        	statement.setInt(4, productId);
        	
        	statement.executeUpdate();
            statement.close();
            connection.close();
        	return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}