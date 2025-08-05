package com.aaslin.OrderManagement.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aaslin.OrderManagement.dao.ProductDAO;

@WebServlet("/UpdateProductServlet")
public class UpdateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		try {
            int productId = Integer.parseInt(request.getParameter("product_id"));
            int quantity = Integer.parseInt(request.getParameter("quantity"));
            String is_active = request.getParameter("is_active");
            String updated_by = request.getParameter("updated_by");

            ProductDAO dao = new ProductDAO();
			boolean bool = dao.updateProduct(productId, quantity, is_active, updated_by);
            
            if (bool) {
            	writer.println("<h2>Product Updated Successfully!</h2>");
            }
            else {
				writer.println("<h2>Failed to update product!</h2>");
			}
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().write("Error updating product.");
        }
	}
}