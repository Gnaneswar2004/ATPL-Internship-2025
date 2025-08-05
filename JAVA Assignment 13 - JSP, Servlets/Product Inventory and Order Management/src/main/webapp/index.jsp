<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inventory Management</title>
	<style>
		button {
			width: 250px;
            padding: 10px 20px;
            font-size: 16px;
		}
	</style>
</head>
<body>
	<h1>Welcome to Product Inventory and Order Management</h1>
	<button onClick="location.href='add-order.jsp'">New Order</button><br>
	<button onClick="location.href='update-order.jsp'">Update Order</button><br>
	<button onClick="location.href='${pageContext.request.contextPath}/OrderHistoryServlet'">Order History</button><br>
	<button onClick="location.href='add-product.jsp'">New Product</button><br>
	<button onClick="location.href='update-product.jsp'">Update Product</button><br>
	<button onClick="location.href='${pageContext.request.contextPath}/ProductListServlet'">Product List</button>
</body>
</html>