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
  quantity INT
);