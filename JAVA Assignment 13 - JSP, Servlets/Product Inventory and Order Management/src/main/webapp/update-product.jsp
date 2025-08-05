<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head><title>Update a Product</title></head>
<body>
    <h2>Update a Product</h2>
    <form action="UpdateProductServlet" method="post">
        Product ID : <input type="number" name="product_id" required><br>
        Quantity : <input type="number" name="quantity"><br>
        Is Available : <select id="is_active" name="is_active" required>
            <option value="true" selected>True</option>
            <option value="false">False</option>
        </select><br>
        Updated By : <input type="text" name="updated_by" required><br>
        <input type="submit" value="Update Product">
    </form>
    <button onClick="location.href='index.jsp'">Back</button>
</body>
</html>