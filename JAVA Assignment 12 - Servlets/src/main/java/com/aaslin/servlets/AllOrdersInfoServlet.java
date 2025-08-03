package com.aaslin.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/order/all-orders-info")
public class AllOrdersInfoServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private static final String url  = "jdbc:mysql://192.168.71.15:3306/intern";
	private static final String user = "intern2025";
	private static final String password = "intern2025";
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			try (Connection connection = DriverManager.getConnection(url, user, password)) { 
				
				String query = "select * from orders_gnani";
				PreparedStatement statement = connection.prepareStatement(query);
				ResultSet result = statement.executeQuery();
				
				boolean found = false;
				
				while(result.next()) {
					found = true;
					writer.println("Order ID : " + result.getInt("id") + " Item ID : " + result.getInt("item_id") + " Quantity : " + result.getInt("quantity") + " Order Date : " + result.getTimestamp("order_date") + "<br>");
				}
				
				if (!found) {
					response.sendError(HttpServletResponse.SC_NOT_FOUND, "Users not found.");
				}
			}
		}
		catch (Exception e) {
			writer.println("<h2>Error : " + e.getMessage() + "</h2>");
			e.printStackTrace(writer);
		}
	}
}