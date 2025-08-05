package com.aaslin.OrderManagement.Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aaslin.OrderManagement.dao.ProductDAO;
import com.aaslin.OrderManagement.model.Product;

@WebServlet("/ProductListServlet")
public class ProductListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        ProductDAO dao = new ProductDAO();
        List<Product> productList = dao.getAllProducts();

        out.println("<h2>Product List</h2>");

        if (productList == null || productList.isEmpty()) {
            out.println("<p>No products found.</p>");
        } else {
            out.println("<table border='1' cellpadding='8'>");
            out.println("<tr><th>Product ID :</th><th>Name :</th><th>Quantity :</th><th>Unit Price :</th><th>Is Active :</th><th>Created Date :</th><th>Created By :</th><th>Updated Date :</th><th>Updated By :</th></tr>");

            for (Product p : productList) {
                out.println("<tr>");
                out.println("<td>" + p.getProduct_id() + "</td>");
                out.println("<td>" + p.getName() + "</td>");
                out.println("<td>" + p.getPrice() + "</td>");
                out.println("<td>" + p.getStock_quantity() + "</td>");
                out.println("<td>" + p.isIs_active() + "</td>");
                out.println("<td>" + p.getCreated_date() + "</td>");
                out.println("<td>" + p.getCreated_by() + "</td>");
                out.println("<td>" + p.getUpdated_date() + "</td>");
                out.println("<td>" + p.getUpdated_by() + "</td>");
                out.println("</tr>");
            }

            out.println("</table>");
        }

        out.println("<br><a href='index.jsp'>Go Back to Home</a>");
        out.println("</body></html>");
	}

}