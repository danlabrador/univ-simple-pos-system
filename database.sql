CREATE DATABASE JavaDBExam;

USE JavaDBExam;

CREATE TABLE IF NOT EXISTS products (
 id INT PRIMARY KEY AUTO_INCREMENT,
 name VARCHAR(45),
 price DECIMAL(10,2)
);

CREATE TABLE IF NOT EXISTS stock (
  id INT PRIMARY KEY AUTO_INCREMENT,
  product_id INT,
  FOREIGN KEY(product_id) REFERENCES products(id),
  quantity INT
);

CREATE TABLE IF NOT EXISTS `order` (
  id INT PRIMARY KEY AUTO_INCREMENT,
  customer_name VARCHAR(45),
  order_date DATETIME
);

CREATE TABLE IF NOT EXISTS product_order (
  id INT PRIMARY KEY AUTO_INCREMENT,
  product_id INT,
  FOREIGN KEY(product_id) REFERENCES products(id),
  order_id INT,
  FOREIGN KEY(order_id) REFERENCES `order`(id),
  price DECIMAL(10,2),
  quantity INT
);


INSERT INTO products (name, price) VALUES
('Espresso Euphoria', 150),
('Caramel Macchiato Bliss', 160),
('Mocha Dream Delight', 150),
('Vanilla Velvet Espresso', 160),
('Hazelnut Hug in a Mug', 160),
('Double Shot Symphony', 170),
('Iced Espresso Cascade', 170),
('Cinnamon Swirl Espresso', 160),
('Caramel Cloud Latte', 160),
('Velvet Cappuccino Crush', 150),
('Honeycomb Latte Love', 160),
('Matcha Marvel Cappuccino', 170),
('Irish Cream Latte Lullaby', 170),
('Tiramisu Toffee Latte', 160),
('Cold Brew Cascade', 170),
('Iced Almond Joy Coffee', 160),
('Caramel Sea Salt Chill', 170),
('Vanilla Chai Cold Brew', 160),
('Coconut Cream Iced Coffee', 160),
('Cinnamon Bun Latte', 170),
('Nutella Delight Mocha', 160),
('Maple Pecan Praline Coffee', 170),
('Campfire S\'mores Latte', 160),
('White Chocolate Raspberry Mocha', 170),
('Spiced Chai Latte Fusion', 160),
('Rooibos Red Velvet Latte', 170),
('Decaf Dark Chocolate Delight', 160),
('Herbal Honey Lavender Latte', 170),
('Decaf Vanilla Spice Affair', 160),
('Creamy Camomile Latte', 170);

-- Assuming there are 30 products based on the provided list
-- and a random daily sale between 0 and 20 items per product
-- for a 2-month period (approximately 60 days).

INSERT INTO stock (product_id, quantity) 
SELECT id, ROUND(RAND() * 20 * 60) AS quantity
FROM products;