package com.aaslin.OrderManagement.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aaslin.OrderManagement.dao.OrderDAO;

@WebServlet("/UpdateOrderServlet")
public class UpdateOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		try {
            int orderId = Integer.parseInt(request.getParameter("order_id"));
            String status = request.getParameter("status");
            String updatedBy = request.getParameter("created_by");

            OrderDAO dao = new OrderDAO();
            boolean bool = dao.updateOrder(orderId, status, updatedBy);

            if (bool) {
            	writer.println("<h2>Order Updated Successfully!</h2>");
            }
            else {
				writer.println("<h2>Failed to update order!</h2>");
			}
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().write("Error updating order.");
        }
	}
}