package com.aaslin.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class AdminStoreUserServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
    
	private static final String url  = "jdbc:mysql://192.168.71.15:3306/intern";
	private static final String user = "intern2025";
	private static final String password = "intern2025";

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("userId");
		String name = request.getParameter("userName");
		String email = request.getParameter("userEmail");
		String role = request.getParameter("userRole");
		String active = request.getParameter("is_active");
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		if (id == null || name == null || email == null || role == null || active == null) {
			writer.println("<h2>Admin User Details are missing.</h2>");
			return;
		}
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			try (Connection connection = DriverManager.getConnection(url, user, password)) { 
				
				String query = "insert into user_gnani (id, name, email, role, is_active) values (?, ?, ?, ?, ?)";
				PreparedStatement statement = connection.prepareStatement(query);
				statement.setInt(1, Integer.parseInt(id));
				statement.setString(2, name);
				statement.setString(3, email);
				statement.setString(4, role);
				statement.setInt(5, Boolean.parseBoolean(active) ? 1 : 0);
				
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