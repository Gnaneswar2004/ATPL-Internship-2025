<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head><title>Add New Order</title></head>
<body>
    <h2>Place a New Order</h2>
    <form action="AddOrderServlet" method="post">
        Product ID : <input type="number" name="product_id" required><br>
        Quantity : <input type="number" name="quantity" required><br>
        Customer Name : <input type="text" name="customer_name" required><br>
        Created By : <input type="text" name="created_by" required><br>
        <input type="submit" value="Add Order">
    </form>
    <button onClick="location.href='index.jsp'">Back</button>
</body>
</html>