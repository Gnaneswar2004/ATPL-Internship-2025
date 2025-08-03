package com.aaslin.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class AdminToggleActiveServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    
	private static final String url  = "jdbc:mysql://192.168.71.15:3306/intern";
	private static final String user = "intern2025";
	private static final String password = "intern2025";
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("userId");
		String active = request.getParameter("is_active");
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		if (id == null || active == null) {
			writer.println("<h2>User ID is missing.</h2>");
			return;
		}
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			try (Connection connection = DriverManager.getConnection(url, user, password)) { 
					
				String query = "update user_gnani set is_active = ? where id = ? and role = 'admin';";
				PreparedStatement statement = connection.prepareStatement(query);
				statement.setInt(1, Boolean.parseBoolean(active) ? 1 : 0);
				statement.setInt(2, Integer.parseInt(id));
				
				int rows = statement.executeUpdate();
	            if (rows > 0) {
	                writer.println("<h2>User active status updated!</h2>");
	            } else {
	                writer.println("<h2>User not found or update failed.</h2>");
	            }
			}
		}
		catch (Exception e) {
			writer.println("<h2>Error : " + e.getMessage() + "</h2>");
			e.printStackTrace(writer);
		}
	}
}