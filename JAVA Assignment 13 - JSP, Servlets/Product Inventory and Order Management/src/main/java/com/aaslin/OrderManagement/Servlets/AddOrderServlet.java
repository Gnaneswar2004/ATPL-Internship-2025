package com.aaslin.OrderManagement.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aaslin.OrderManagement.dao.OrderDAO;
import com.aaslin.OrderManagement.model.Order;

@WebServlet("/AddOrderServlet")
public class AddOrderServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		try {
			int productId = Integer.parseInt(request.getParameter("product_id"));
            int quantity = Integer.parseInt(request.getParameter("quantity"));
            String customerName = request.getParameter("customer_name");
            String createdBy = request.getParameter("created_by");

            Order order = new Order(productId, quantity, customerName, createdBy);
            OrderDAO dao = new OrderDAO();
            @SuppressWarnings("unused")
			boolean bool = dao.addOrder(order);
            
            if (bool = true) {
            	writer.println("<h2>Order Added Successfully!</h2>");
            }
            else {
				writer.println("<h2>Failed to add order!</h2>");
			}
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().write("Error adding order.");
        }
	}
}