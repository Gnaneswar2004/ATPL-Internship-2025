package com.aaslin.filters;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class AdminRoleFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
    	
        HttpServletRequest req = (HttpServletRequest) request;
        String role = req.getParameter("role");
        if ("admin".equals(role)) {
            chain.doFilter(request, response);
        } else {
            response.setContentType("text/html");
            response.getWriter().println("<h2>Access Denied: Admin role required.</h2>");
        }
    }
}