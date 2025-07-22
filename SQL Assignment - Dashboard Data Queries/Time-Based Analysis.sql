-- Time-Based Analysis

-- 14. How many orders are placed each month?

SELECT 
    STRFTIME('%Y-%m', OrderDate) AS Month, COUNT(*) AS Orders
FROM 
    Orders
GROUP BY 
    Month
ORDER BY 
    Month;

-- 15. What is the average order value per month?

SELECT 
    STRFTIME('%Y-%m', o.OrderDate) AS Month, 
    AVG(OrderTotal) AS AvgOrderValue
FROM (
    SELECT 
        o.OrderID, SUM(od.Quantity * p.Price) AS OrderTotal
    FROM 
        Orders o
    JOIN 
        OrderDetails od ON o.OrderID = od.OrderID
    JOIN 
        Products p ON od.ProductID = p.ProductID
    GROUP BY 
        o.OrderID
) AS MonthlyOrders
JOIN 
    Orders o ON o.OrderID = MonthlyOrders.OrderID
GROUP BY 
    Month
ORDER BY 
    Month;

-- 16. Which month had the highest number of orders?

SELECT 
    STRFTIME('%Y-%m', OrderDate) AS Month, COUNT(*) AS OrderCount
FROM 
    Orders
GROUP BY 
    Month
ORDER BY 
    OrderCount DESC
LIMIT 1;