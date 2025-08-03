package com.aaslin.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class AdminUserInfoServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    
	private static final String url  = "jdbc:mysql://192.168.71.15:3306/intern";
	private static final String user = "intern2025";
	private static final String password = "intern2025";
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("userId");
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		if (id == null) {
			writer.println("<h2>User ID is missing.</h2>");
			return;
		}
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			try (Connection connection = DriverManager.getConnection(url, user, password)) { 
					
				String query = "select * from user_gnani where id = ?";
				PreparedStatement statement = connection.prepareStatement(query);
				statement.setInt(1, Integer.parseInt(id));
				ResultSet result = statement.executeQuery();
					
				if (result.next()) {
					writer.println("ID : " + result.getInt("id") + " Name : " + result.getString("name") + " Email : " + result.getString("email") + " Role : " + result.getString("role") + " is Active : " + result.getBoolean("is_active"));
				}
					
				else {
					response.sendError(HttpServletResponse.SC_NOT_FOUND, "User not found with id : " + id);
				}
			}
		}
		catch (Exception e) {
			writer.println("<h2>Error : " + e.getMessage() + "</h2>");
			e.printStackTrace(writer);
		}
	}
}