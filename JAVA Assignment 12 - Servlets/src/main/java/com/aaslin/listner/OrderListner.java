package com.aaslin.listner;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.*;
import java.sql.Timestamp;
import java.time.format.DateTimeFormatter;

@WebListener
public class OrderListner implements ServletRequestListener {
	
	@Override
    public void requestDestroyed(ServletRequestEvent request) {
        HttpServletRequest req = (HttpServletRequest) request.getServletRequest();
        HttpSession session = req.getSession(false);
        if (session != null) {
            
			Object itemId = session.getAttribute("log_item_id");
			Object quantity = session.getAttribute("log_quantity");
			Object date = session.getAttribute("log_order_time");
			
            if (date != null && itemId != null && quantity != null) {
                Timestamp ts = (Timestamp) date;
                String orderTime = ts.toLocalDateTime().format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a"));
                System.out.println("Order Date : " + orderTime + ", Item ID : " + itemId + ", Item Qty :" + quantity);

                session.removeAttribute("log_item_id");
                session.removeAttribute("log_quantity");
                session.removeAttribute("log_order_time");
            }
        }
    }
}