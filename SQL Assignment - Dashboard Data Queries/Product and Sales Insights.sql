-- Product and Sales Insights

-- 4. What are the top 5 best-selling products by quantity?

SELECT 
    p.ProductName, SUM(od.Quantity) AS TotalSold
FROM 
    OrderDetails od
JOIN 
    Products p ON od.ProductID = p.ProductID
GROUP BY 
    p.ProductName
ORDER BY 
    TotalSold DESC
LIMIT 5;

-- 5. Which are the top 5 products by total revenue generated?

SELECT 
    p.ProductName, SUM(od.Quantity * p.Price) AS Revenue
FROM 
    OrderDetails od
JOIN 
    Products p ON od.ProductID = p.ProductID
GROUP BY 
    p.ProductName
ORDER BY 
    Revenue DESC
LIMIT 5;

-- 6. What is the average revenue per product?

SELECT 
    AVG(ProductRevenue) AS AvgRevenuePerProduct
FROM (
    SELECT 
        p.ProductID, SUM(od.Quantity * p.Price) AS ProductRevenue
    FROM 
        OrderDetails od
    JOIN 
        Products p ON od.ProductID = p.ProductID
    GROUP BY 
        p.ProductID
) AS RevenueTable;

-- 7. What is the total revenue generated per product category?

SELECT 
    c.CategoryName, SUM(od.Quantity * p.Price) AS TotalRevenue
FROM 
    OrderDetails od
JOIN 
    Products p ON od.ProductID = p.ProductID
JOIN 
    Categories c ON p.CategoryID = c.CategoryID
GROUP BY 
    c.CategoryName;

-- 8. Which product categories have the highest average price per product?

SELECT 
    c.CategoryName, AVG(p.Price) AS AvgPrice
FROM 
    Products p
JOIN 
    Categories c ON p.CategoryID = c.CategoryID
GROUP BY 
    c.CategoryName
ORDER BY 
    AvgPrice DESC;