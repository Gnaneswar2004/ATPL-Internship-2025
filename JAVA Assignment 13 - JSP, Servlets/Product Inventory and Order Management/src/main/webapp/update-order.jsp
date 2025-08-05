<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head><title>Update an Order</title></head>
<body>
    <h2>Update an Order</h2>
    <form action="UpdateOrderServlet" method="post">
        Order ID : <input type="number" name="order_id" required><br>
        Status : <select id="status" name="status" required>
            <option value="Placed" selected>Placed</option>
            <option value="Delivered">Delivered</option>
            <option value="Cancelled">Cancelled</option>
        </select><br>
        Updated By : <input type="text" name="created_by" required><br>
        <input type="submit" value="Update Order">
    </form>
    <button onClick="location.href='index.jsp'">Back</button>
</body>
</html>