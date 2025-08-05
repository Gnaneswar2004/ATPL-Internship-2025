package com.aaslin.OrderManagement.Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aaslin.OrderManagement.dao.OrderDAO;
import com.aaslin.OrderManagement.model.Order;

@WebServlet("/OrderHistoryServlet")
public class OrderHistoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        OrderDAO dao = new OrderDAO();
        List<Order> orderList = dao.getAllOrders();

        out.println("<h2>Order History</h2>");

        if (orderList == null || orderList.isEmpty()) {
            out.println("<p>No orders found.</p>");
        } else {
            out.println("<table border='1' cellpadding='8'>");
            out.println("<tr><th>Order ID :</th><th>Product ID :</th><th>Quantity :</th><th>Customer Name :</th><th>Order Date :</th><th>Status :</th><th>Is Active :</th><th>Created Date :</th><th>Created By :</th><th>Updated Date :</th><th>Updated By :</th></tr>");

            for (Order o : orderList) {
                out.println("<tr>");
                out.println("<td>" + o.getOrder_id() + "</td>");
                out.println("<td>" + o.getProduct_id() + "</td>");
                out.println("<td>" + o.getQuantity() + "</td>");
                out.println("<td>" + o.getCustomer_name() + "</td>");
                out.println("<td>" + o.getOrder_date() + "</td>");
                out.println("<td>" + o.getStatus() + "</td>");
                out.println("<td>" + o.isIs_active() + "</td>");
                out.println("<td>" + o.getCreated_date() + "</td>");
                out.println("<td>" + o.getCreated_by() + "</td>");
                out.println("<td>" + o.getUpdated_date() + "</td>");
                out.println("<td>" + o.getUpdated_by() + "</td>");
                out.println("</tr>");
            }

            out.println("</table>");
        }

        out.println("<br><a href='index.jsp'>Go Back to Home</a>");
        out.println("</body></html>");
	}
}