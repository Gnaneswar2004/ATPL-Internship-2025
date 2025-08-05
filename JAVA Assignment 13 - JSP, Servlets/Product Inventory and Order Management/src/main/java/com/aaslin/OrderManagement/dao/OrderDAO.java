package com.aaslin.OrderManagement.dao;

import com.aaslin.OrderManagement.model.Order;
import com.aaslin.OrderManagement.util.DBConnection;

import java.sql.*;
import java.util.*;

public class OrderDAO implements OrdersDAO {

    @Override
    public boolean addOrder(Order order) {
        String query = "INSERT INTO orders_gnani (product_id, quantity, customer_name, status, created_date, created_by, updated_date, updated_by) VALUES (?, ?, ?, ?, NOW(), ?, NOW(), ?)";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

        	statement.setInt(1, order.getProduct_id());
        	statement.setInt(2, order.getQuantity());
        	statement.setString(3, order.getCustomer_name());
            statement.setString(4, "Placed");;
            statement.setString(5, order.getCreated_by());
            statement.setString(6, order.getCreated_by());

            statement.executeUpdate();
            statement.close();
            connection.close();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Order> getAllOrders() {
        List<Order> orders = new ArrayList<>();
        String query = "SELECT * FROM orders_gnani";

        try (Connection connection = DBConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet result = statement.executeQuery(query)) {

            while (result.next()) {
                orders.add(new Order(
                	result.getInt("order_id"),
                	result.getInt("product_id"),
                	result.getInt("quantity"),
                    result.getString("customer_name"),
                    result.getTimestamp("order_date"),
                    result.getString("status"),
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
        return orders;
    }

    public boolean updateOrder (int order_id, String status, String updated_by) {
        String query = "UPDATE orders_gnani SET status = ?, is_active = ?, updated_date = NOW(), updated_by = ? WHERE order_id = ?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, status);
            statement.setInt(2, "Placed".equals(status) ? 1 : 0);
            statement.setString(3, updated_by);
            statement.setInt(4, order_id);

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