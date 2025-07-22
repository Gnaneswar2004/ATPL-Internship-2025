-- Employee and Shipping Insights

-- 17. How many orders has each employee handled?

SELECT 
    e.FirstName || ' ' || e.LastName AS EmployeeName,
    COUNT(o.OrderID) AS OrdersHandled
FROM 
    Orders o
JOIN 
    Employees e ON o.EmployeeID = e.EmployeeID
GROUP BY 
    EmployeeName
ORDER BY 
    OrdersHandled DESC;

-- 18. Which employee generated the highest revenue?

SELECT 
    e.FirstName || ' ' || e.LastName AS EmployeeName,
    SUM(od.Quantity * p.Price) AS TotalRevenue
FROM 
    Orders o
JOIN 
    Employees e ON o.EmployeeID = e.EmployeeID
JOIN 
    OrderDetails od ON o.OrderID = od.OrderID
JOIN 
    Products p ON od.ProductID = p.ProductID
GROUP BY 
    EmployeeName
ORDER BY 
    TotalRevenue DESC
LIMIT 1;

-- 19. How frequently has each shipper been used?

SELECT 
    s.ShipperName, COUNT(*) AS Shipments
FROM 
    Orders o
JOIN 
    Shippers s ON o.ShipperID = s.ShipperID
GROUP BY 
    s.ShipperName
ORDER BY 
    Shipments DESC;

-- 20. Which shipper delivered the most revenue-generating orders?

SELECT 
    s.ShipperName, SUM(od.Quantity * p.Price) AS RevenueGenerated
FROM 
    Orders o
JOIN 
    Shippers s ON o.ShipperID = s.ShipperID
JOIN 
    OrderDetails od ON o.OrderID = od.OrderID
JOIN 
    Products p ON od.ProductID = p.ProductID
GROUP BY 
    s.ShipperName
ORDER BY 
    RevenueGenerated DESC
LIMIT 1;