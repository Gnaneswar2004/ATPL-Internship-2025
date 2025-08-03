package com.aaslin.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class StoreUserInfoServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
	private static final String url  = "jdbc:mysql://192.168.71.15:3306/intern";
	private static final String user = "intern2025";
	private static final String password = "intern2025";
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("userId");
		String name = request.getParameter("userName");
		String email = request.getParameter("userEmail");
		String phoneNumber = request.getParameter("phoneNumber");
		String dob = request.getParameter("dob");
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		if (id == null || name == null || email == null || phoneNumber == null) {
			writer.println("<h2>User Details are missing.</h2>");
			return;
		}
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			try (Connection connection = DriverManager.getConnection(url, user, password)) { 
				
				String query = "insert into users_gnani (user_id, user_name, user_email, phone_number, dob) values (?, ?, ?, ?, ?)";
				PreparedStatement statement = connection.prepareStatement(query);
				statement.setInt(1, Integer.parseInt(id));
				statement.setString(2, name);
				statement.setString(3, email);
				statement.setLong(4, Long.parseLong(phoneNumber));
				statement.setString(5, dob);
				
				int row = statement.executeUpdate();
				
				if (row > 0) {
					writer.println("<h2>Data Stored Successfully!</h2>");
				}
				else {
					writer.println("<h2>Failed to store the data!</h2>");
				}
			}
		}
		catch (Exception e) {
			writer.println("<h2>Error : " + e.getMessage() + "</h2>");
			e.printStackTrace(writer);
		}
	}
}