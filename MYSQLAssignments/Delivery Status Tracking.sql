--  Logistics Company – Delivery Status Tracking
-- Scenario
-- A logistics company tracks package delivery status.

Create database logistics_db;

use logistics_db;
Create table Delivery(delivery_id int, customer_name varchar(20), delivery_date varchar(10),is_delivered varchar(20));

insert into Delivery (delivery_id, customer_name, delivery_date, is_delivered) Values
(0021, 'Sakshi', '24-11-2025', 'Delivered'),
(0024, 'Srushti', '04-02-2026', 'Not Delivered'),
(0022, 'Shatakshi', '23-12-2015', 'Delivered');

select * From Delivery where is_delivered = 'Delivered';