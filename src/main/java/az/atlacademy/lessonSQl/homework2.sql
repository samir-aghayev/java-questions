CREATE TABLE Products
(
    product_id   SERIAL PRIMARY KEY,
    name         VARCHAR(50),
    price        DECIMAL,
    quantity     INT,
    descripotion VARCHAR(100)
);

CREATE TABLE Categories
(
    category_id SERIAL PRIMARY KEY,
    name        VARCHAR(50)
);

ALTER TABLE Products
    ADD COLUMN category_id INT REFERENCES Categories (category_id);

CREATE TABLE Customers
(
    customer_id  SERIAL PRIMARY KEY,
    first_name   VARCHAR(50),
    last_name    VARCHAR(50),
    adress       VARCHAR(50),
    email        VARCHAR(50) CHECK ( email LIKE '%@gmail.com' ),
    phone_number DECIMAL(12)
);



CREATE TABLE Orders
(
    order_id    SERIAL PRIMARY KEY,
    customer_id INT,
    order_date  DATE
);

CREATE TABLE Order_Details
(
    order_detail SERIAL PRIMARY KEY,
    orderId      int references Orders (order_id),
    productId    int references Products (product_id),
    quantity     INT
);

INSERT INTO Categories (name)
VALUES ('Category 1'),
       ('Category 2'),
       ('Category 3'),
       ('Category 4'),
       ('Category 5'),
       ('Category 6'),
       ('Category 7'),
       ('Category 8'),
       ('Category 9'),
       ('Category 10');


INSERT INTO Products (name, price, quantity, descripotion, category_id)
VALUES ('Laptop', 1500.00, 10, 'High-performance laptop for professional use', 1),
       ('Smartphone', 999.99, 20, 'Flagship smartphone with advanced features', 1),
       ('Tablet', 599.99, 15, 'Portable tablet with a large display', 2),
       ('Wireless Earbuds', 199.99, 30, 'Bluetooth earbuds with noise cancellation', 1),
       ('Smart Watch', 349.99, 8, 'Fitness tracking smartwatch with heart rate monitor', 3),
       ('Gaming Console', 499.99, 5, 'Next-gen gaming console with immersive graphics', 5),
       ('Robot Vacuum Cleaner', 299.99, 12, 'Automated vacuum cleaner for smart homes', 6),
       ('Wireless Router', 129.99, 25, 'High-speed router for fast and reliable internet', 7),
       ('Smart Home Security System', 599.99, 3, 'Complete security solution for smart homes', 8),
       ('3D Printer', 899.99, 7, 'Advanced 3D printer for rapid prototyping', 8);


INSERT INTO Customers (first_name, last_name, adress, email, phone_number)
VALUES ('John', 'Doe', '123 Main St', 'johndoe@gmail.com', 1234567890),
       ('Jane', 'Smith', '456 Elm St', 'janesmith@gmail.com', 9876543210),
       ('Michael', 'Johnson', '789 Oak St', 'michaeljohnson@gmail.com', 5678901234),
       ('Emily', 'Williams', '321 Pine St', 'emilywilliams@gmail.com', 4321098765),
       ('David', 'Brown', '654 Maple St', 'davidbrown@gmail.com', 8901234567),
       ('Sarah', 'Jones', '987 Cedar St', 'sarahjones@gmail.com', 2109876543),
       ('Robert', 'Taylor', '234 Walnut St', 'roberttaylor@gmail.com', 6789012345),
       ('Jennifer', 'Davis', '567 Birch St', 'jenniferdavis@gmail.com', 5432109876),
       ('William', 'Miller', '890 Spruce St', 'williammiller@gmail.com', 9012345678),
       ('Jessica', 'Wilson', '123 Oak St', 'jessicawilson@gmail.com', 3456789012);



INSERT INTO Orders (customer_id, order_date)
VALUES (1, '2023-07-15'),
       (1, '2023-07-15'),
       (3, '2023-07-13'),
       (3, '2023-07-11'),
       (3, '2023-07-11'),
       (5, '2023-07-10'),
       (7, '2023-07-09'),
       (7, '2023-07-08'),
       (9, '2023-07-07'),
       (10, '2023-07-06');

INSERT INTO Order_Details (orderId, productId, quantity)
VALUES (1, 1, 5),
       (2, 2, 3),
       (3, 3, 2),
       (4, 4, 1),
       (5, 1, 10),
       (6, 2, 4),
       (7, 3, 6),
       (8, 4, 2),
       (9, 1, 8),
       (10, 2, 2);


--Get a list of all products.
SELECT *
FROM Products;

--Get a list of all categories of products.
SELECT *
FROM Categories;

--Get a list of all customers.
SELECT *
FROM Customers;

--Get a list of all orders.
SELECT *
FROM Orders;

--Get a list of all order details.
SELECT *
FROM Order_Details;

--Get information about a specific product by its ID.
SELECT *
FROM Products
WHERE product_id = 3;

--Get a list of products in a specific category.
SELECT *
FROM Products
WHERE category_id = 1;

--Get information about a customer by their ID.
SELECT *
FROM Customers
WHERE customer_id = 3;

--Get a list of orders for a specific customer.
select order_id
from Orders
where customer_id = 1;

--Get a list of order details for a specific order.
select *
from order_details
where orderId = 2;

--Update the price of a product by its ID.
UPDATE Products
SET price=200.00
WHERE product_id = 4;

--Add a new product.
INSERT INTO Products(name, price, quantity, descripotion, category_id)
VALUES ('MACBOOK PRO', 8659.59, 300, 'Macbook pro 16 inch with M2 max chip', 1);

--Delete a product by its ID.
DELETE
FROM Products
WHERE product_id = 10;

--Məsələn belə bir şey etmək lazımdır.
--Müştəri id-sinə görə (customer_id) vəya adına görə hansı məhsulları (Products.name),
--nə qədər aldığına (Order_Details.quantity),hər məhsulun tək qiymətinə (Products.price),
--hər məhsul üçün saya uyğun nə qədər pul verdiyinə(Order_Details.quantity * Products.price AS total_price)
--baxmaq istətirik.