-- E-Commerce Company – Product Management

Create database ecommerce_db;

use ecommerce_db;

Create table Product (product_id int, product_name varchar(20), price double, is_available varchar(10));

insert Product(product_id, product_name, price, is_available)VALUES
(1, 'Shoes', 20000, 'available'),
(2, 'Books', 559, 'OutofStock'),
(3, 'Phones', 25000, 'available');

Select is_available from Product;