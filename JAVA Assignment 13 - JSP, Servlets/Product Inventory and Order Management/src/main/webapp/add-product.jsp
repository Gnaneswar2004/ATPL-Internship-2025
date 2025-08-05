<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head><title>Add New Product</title></head>
<body>
    <h2>Add New Product</h2>
    <form action="AddProductServlet" method="post">
        Name : <input type="text" name="name" required><br>
        Price : <input type="number" name="price" required><br>
        Stock Quantity : <input type="number" name="stock_quantity" required><br>
        Created By : <input type="text" name="created_by" required><br>
        <input type="submit" value="Add Product">
    </form>
    <button onClick="location.href='index.jsp'">Back</button>
</body>
</html>