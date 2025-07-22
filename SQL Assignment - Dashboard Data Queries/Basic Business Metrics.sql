-- Basic Business Metrics

-- 1. What is the total number of orders?

SELECT COUNT(*) AS TotalOrders FROM Orders;

-- 2. How many customers are there?

SELECT COUNT(*) AS TotalCustomers FROM Customers;

-- 3. What is the total revenue from all orders?

SELECT 
    SUM(od.Quantity * p.Price) AS TotalRevenue
FROM 
    OrderDetails od
JOIN 
    Products p ON od.ProductID = p.ProductID;
