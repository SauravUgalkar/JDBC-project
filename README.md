# JDBC-project
task 1 and 2 - database connection and CRUD operations
Database CRUD System (JDBC)
A data persistence application that connects Java to a MySQL database.

Key Features: Full CRUD (Create, Read, Update, Delete) capabilities for user records.

Tech Highlight: Uses JDBC (Java Database Connectivity) and PreparedStatement to handle SQL queries securely and prevent SQL injection.

Logic: Automatically detects if the database table exists and creates it if missing, ensuring seamless setup.

Key Skill to Tag:

JDBC

MySQL / SQL

PreparedStatement

Driver Management

task 3 - parametrized query
# JDBC Exam Database Management System

## 📌 Project Overview
This project is a Java-based console application designed to manage user credentials and database interactions for an Exam System. It demonstrates the robust integration of Core Java with a MySQL database using **JDBC (Java Database Connectivity)**.

The core philosophy of this project is **secure and efficient data handling**. It moves away from traditional Statement-based queries and strictly implements **Parameterized Queries** to ensure data integrity and security.

## 🚀 Key Features
* **Secure Database Connection:** Establishes a robust connection to the MySQL backend using the `com.mysql.cj.jdbc.Driver`.
* **User Registration:** Allows new users to register by safely inserting their username, password, and initial score into the database.
* **User Authentication:** A logic-based login system that retrieves user data and verifies credentials using Collection frameworks (`HashMap`) alongside database queries.
* **Menu-Driven Interface:** A clean console UI for navigating between login and registration modules.

## 💻 Technical Highlight: Parameterized Queries
The standout feature of this project is the extensive use of **Parameterized Queries** via the `PreparedStatement` interface. This approach was chosen over standard `Statement` execution for three critical reasons:

1.  **Prevention of SQL Injection:** By using placeholders (`?`) instead of string concatenation, the system treats user input strictly as data, not executable code.
2.  **Performance Optimization:** The database pre-compiles the SQL statement structure, making repeated execution (like inserting multiple users) significantly faster.
3.  **Type Safety:** It ensures that data types (Strings, Integers) are strictly adhered to during database insertion.

### Code Example (From Project)
Instead of unsafe string concatenation like:
`"INSERT INTO User VALUES ('" + name + "', '" + pass + "')"`

This project implements the **Parameterized concept**:

```java
// Secure implementation from Input.java
String sql = "INSERT INTO User VALUES (?,?,?);";
PreparedStatement stmt = conn.prepareStatement(sql);

// Binding parameters dynamically
stmt.setString(1, username); // Safe binding
stmt.setString(2, password); // Safe binding
stmt.setInt(3, 0);           // Default score

int count = stmt.executeUpdate(); // Execution
