## CampusTrack-JDBC

CampusTrack-JDBC is a Java-based application developed using Core Java, JDBC, and MySQL.
The project focuses on database connectivity and implementing basic CRUD operations with a simple layered structure.

## Features

* Add new records
* View a record and all records
* Update existing records
* Delete records
* MySQL database integration
* JDBC-based database operations
* DAO pattern for database access
* Layered project structure
* Exception handling

##  Technologies Used

 Java
 JDBC
 MySQL
 SQL
 Maven
 Git & GitHub

##  Project Structure

src/main/java
│
├── controller
├── service
├── dao
├── model
├── util
└── main

The project follows a simple flow:

Controller → Service → DAO → JDBC → MySQL


##  CRUD Operations

| Operation | Purpose                 |
| --------- | ----------------------- |
| Create    | Add new records         |
| Read      | Retrieve records        |
| Update    | Modify existing records |
| Delete    | Remove records          |

##  Database

**MySQL** is used for storing data, while **JDBC** is used to connect the Java application with the database and execute SQL queries.

Before running the project, configure your MySQL database and connection details.

> Do not upload real database passwords or sensitive credentials to GitHub.

##  How to Run

1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Configure the MySQL database.
4. Update the database connection details.
5. Build the project using Maven.
6. Run the main application class.

##  Concepts Practiced

* Core Java
* JDBC & SQL
* MySQL
* CRUD Operations
* DAO Pattern
* Layered Architecture
* Exception Handling
* Maven
* Git & GitHub

##  Future Improvements

* Improve input validation
* Add more features and database operations
* Add automated testing
* Build a REST API using Spring Boot

##  Author
**Nayeem Basha**
