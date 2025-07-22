-- Customer Analytics

-- 9. Who are the top 5 customers by purchase volume?

SELECT 
    cu.CustomerName, SUM(od.Quantity * p.Price) AS TotalSpent
FROM 
    Orders o
JOIN 
    Customers cu ON o.CustomerID = cu.CustomerID
JOIN 
    OrderDetails od ON o.OrderID = od.OrderID
JOIN 
    Products p ON od.ProductID = p.ProductID
GROUP BY 
    cu.CustomerName
ORDER BY 
    TotalSpent DESC
LIMIT 5;

-- 10. How many customers are there in each country?

SELECT 
    Country, COUNT(*) AS NumCustomers
FROM 
    Customers
GROUP BY 
    Country
ORDER BY 
    NumCustomers DESC;

-- 11. Which country contributes the most to total revenue?

SELECT 
    cu.Country, SUM(od.Quantity * p.Price) AS Revenue
FROM 
    Orders o
JOIN 
    Customers cu ON o.CustomerID = cu.CustomerID
JOIN 
    OrderDetails od ON o.OrderID = od.OrderID
JOIN 
    Products p ON od.ProductID = p.ProductID
GROUP BY 
    cu.Country
ORDER BY 
    Revenue DESC
LIMIT 1;

-- 12. What is the average order value per customer?

SELECT 
    cu.CustomerName, AVG(OrderValue) AS AvgOrderValue
FROM (
    SELECT 
        o.OrderID, o.CustomerID, SUM(od.Quantity * p.Price) AS OrderValue
    FROM 
        Orders o
    JOIN 
        OrderDetails od ON o.OrderID = od.OrderID
    JOIN 
        Products p ON od.ProductID = p.ProductID
    GROUP BY 
        o.OrderID, o.CustomerID
) AS OrderValues
JOIN 
    Customers cu ON OrderValues.CustomerID = cu.CustomerID
GROUP BY 
    cu.CustomerName;

-- 13. Which customers placed more than 5 orders?

SELECT 
    cu.CustomerName, COUNT(*) AS OrderCount
FROM 
    Orders o
JOIN 
    Customers cu ON o.CustomerID = cu.CustomerID
GROUP BY 
    cu.CustomerName
HAVING 
    COUNT(*) > 5
ORDER BY 
    OrderCount DESC;