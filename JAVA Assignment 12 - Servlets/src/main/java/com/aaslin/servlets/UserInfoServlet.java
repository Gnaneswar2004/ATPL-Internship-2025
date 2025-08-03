package com.aaslin.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class UserInfoServlet extends HttpServlet {
	
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
				
				String query = "select * from users_gnani where user_id = ?";
				PreparedStatement statement = connection.prepareStatement(query);
				statement.setInt(1, Integer.parseInt(id));
				ResultSet result = statement.executeQuery();
				
				if (result.next()) {
					writer.println("ID : " + result.getInt("user_id") + " Name : " + result.getString("user_name") + " Email : " + result.getString("User_email"));
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