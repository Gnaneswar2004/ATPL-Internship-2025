package com.aaslin.OrderManagement.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aaslin.OrderManagement.dao.ProductDAO;
import com.aaslin.OrderManagement.model.Product;

@WebServlet("/AddProductServlet")
public class AddProductServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		try {
            String name = request.getParameter("name");
            double price = Double.parseDouble(request.getParameter("price"));
            int stockQty = Integer.parseInt(request.getParameter("stock_quantity"));
            String createdBy = request.getParameter("created_by");

            Product product = new Product(name, price, stockQty, createdBy);
            ProductDAO dao = new ProductDAO();
            
			boolean bool = dao.addProduct(product);
            
            if (bool) {
            	writer.println("<h2>Product Added Successfully!</h2>");
            }
            else {
				writer.println("<h2>Failed to add product!</h2>");
			}
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().write("Error adding product.");
        }
	}
}
