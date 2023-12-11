# Simple POS System

## Project Overview

This project aims to develop a Java-based Point of Sale (POS) system, utilizing the JavaDBExam database structure. It's designed to manage product inventory, sales transactions, and stock levels in a retail environment.

## Getting Started

### Prerequisites

- Java Development Kit (JDK)
- NetBeans IDE
- MySQL

### Installation

1. Clone the repository to your local machine.
2. Open the project in NetBeans.
3. Set up the JavaDBExam database using the provided ERD (Entity Relationship Diagram). You can use [this SQL script](https://github.com/danlabrador/univ-simple-pos-system/blob/main/database.sql) to build the database.

![JavaDBExam ERD](https://danlabrador.notion.site/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F7e34410a-8d32-4234-89e2-09fd39557494%2F93092ff9-3a6f-4cf1-bdff-d03b01f950dd%2FUntitled.png?table=block&id=a8a5e1c6-1bed-4142-a44b-301f5981cae6&spaceId=7e34410a-8d32-4234-89e2-09fd39557494&width=670&userId=&cache=v2)

4. Download the following JAR files and add them to your project's classpath:
   - [FlatLaf Core Library](https://search.maven.org/artifact/com.formdev/flatlaf/3.2.5/jar)
   - [FlatLaf Extras Library](https://search.maven.org/artifact/com.formdev/flatlaf-extras/3.2.5/jar)
   - [FlatLaf Roboto Fonts Library](https://search.maven.org/artifact/com.formdev/flatlaf-fonts-roboto/2.137/jar)
   - [FlatLaf IntelliJ Themes Library](https://search.maven.org/artifact/com.formdev/flatlaf-intellij-themes/3.2.5/jar)
   - [MigLayout Core Library](https://github.com/DJ-Raven/swing-crazy-panel/tree/main/library)
   - [MigLayout Swing Library](https://github.com/DJ-Raven/swing-crazy-panel/tree/main/library)
   - [MySQL Connector/J Library](https://mvnrepository.com/artifact/com.mysql/mysql-connector-j/8.2.0)
   - [Raven Bean Pack Library](https://github.com/DJ-Raven/raven-bean-pack/tree/main/raven-bean-pack)
   - [Swing Crazy Panel Library](https://github.com/DJ-Raven/swing-crazy-panel/tree/main/library)

5. Build and run the project.

## Usage

This POS system allows for:

- Adding and updating products in the inventory.
- Managing stock levels.
- Processing sales transactions.
- Viewing products, processing orders, and managing stock through the user interface.

## Development Tasks

1. **Database Setup:** Establish the JavaDBExam database.
2. **Product Management:** Implement methods for product management in the `products` table.
3. **Stock Management:** Develop methods to update stock levels in the `stock` table.
4. **Transaction Processing:** Implement order creation and update stock levels upon sale completion.
5. **User Interface Development:** Design and implement a user interface for product viewing, order processing, and stock management.

## License

This project is licensed under the LICENSE.
