CREATE TABLE products_gnani (
    product_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    stock_quantity INT NOT NULL DEFAULT 0,
    is_active BOOLEAN DEFAULT TRUE,
    created_date DATETIME DEFAULT CURRENT_TIMESTAMP,
    created_by VARCHAR(50),
    updated_date DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    updated_by VARCHAR(50)
);

CREATE TABLE orders_gnani (
    order_id INT AUTO_INCREMENT PRIMARY KEY,
    product_id INT NOT NULL,
    quantity INT NOT NULL,
    customer_name VARCHAR(100) NOT NULL,
    order_date DATETIME DEFAULT CURRENT_TIMESTAMP,
    status VARCHAR(20) DEFAULT 'Placed',
    is_active BOOLEAN DEFAULT TRUE,
    created_date DATETIME DEFAULT CURRENT_TIMESTAMP,
    created_by VARCHAR(50),
    updated_date DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    updated_by VARCHAR(50),
    FOREIGN KEY (product_id) REFERENCES products_gnani(product_id)
);

INSERT INTO products_gnani (name, price, stock_quantity, created_by, updated_by)
VALUES 
('Laptop', 75000.00, 10, 'admin', 'admin'),
('Smartphone', 30000.00, 20, 'admin', 'admin'),
('Wireless Mouse', 1200.50, 50, 'admin', 'admin'),
('Keyboard', 2500.00, 30, 'admin', 'admin'),
('Monitor', 15000.00, 15, 'admin', 'admin');

INSERT INTO orders_gnani (product_id, quantity, customer_name, status, created_by, updated_by)
VALUES 
(1, 1, 'Tharun Reddy', 'Placed', 'admin', 'admin'),
(2, 2, 'Rakesh', 'Placed', 'admin', 'admin'),
(3, 3, 'Yeaswanth', 'Placed', 'admin', 'admin'),
(4, 1, 'Sai Mohith', 'Placed', 'admin', 'admin'),
(5, 2, 'Manideep', 'Placed', 'admin', 'admin');

SELECT * FROM products_gnani;

SELECT * FROM orders_gnani;