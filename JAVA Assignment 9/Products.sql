create table products_gnani (
	product_id int primary key,
    product_name  varchar(20),
    price float
);

insert into products_gnani (product_id, product_name, price) values
(101, 'Laptop', 50000), (102, 'Mobile', 25000), (103, 'TV', 40000);

select * from products_gnani;