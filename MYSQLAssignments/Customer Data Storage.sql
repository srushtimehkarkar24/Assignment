-- Q4. Banking Company – Customer Data Storage

-- Create database
Create database bank_db;

-- Create table Customer 
Create table Customer(customer_id int, name varchar(20), mobile double, city varchar(20));

-- Insert 3 customers
insert into customer(customer_id, name, mobile, city)VALUES
(100, 'vaidahi', 7650983629, 'Pune'),
(101, 'Shubham', 9877655672, 'Mumbai'),
(102, 'Vaibhav', 7649983650, 'Pune');

select * From customer;