package com.aaslin.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class AdminActiveUsersInfoServlet extends HttpServlet {
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
						
				String query = "select * from user_gnani where is_active = true";
				PreparedStatement statement = connection.prepareStatement(query);
				
				ResultSet result = statement.executeQuery();
				boolean found = false;
				
				while(result.next()) {
					found = true;
					writer.println("Name : " + result.getString("name") + " ID : " + result.getInt("id") + " Email : " + result.getString("email") + " Role : " + result.getString("role") + "<br>");
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