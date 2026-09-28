Topic: - LIBRARY MANAGEMENT SYSTEM

Assignment: CSE282 JAVA GROUP PROJECT

Course: CSE 282.6 - PROGRAMMING LANGUAGE II LAB (JAVA)

## Group: 

## Project Team Members

* Abdulla Chowdhury ; ID: 2025000000179
* Arafat Shikder Samim ; ID: 2025000000196
* Hafsa Akter Aurpy ; ID: 2025000000197
* Simanto Bala ; ID: 2025000000290

# 📚 Book Nest — Library Management System

Book Nest is a simple Library Management System developed using Java. This project is based on Java Object-Oriented Programming (OOP) concepts.

The system allows users to create accounts and log in to the library system. After successful login, users can search for books, view book information, borrow or return books, purchase books, and manage book stock. The system also provides administrative book management features such as adding, searching, updating, and deleting books.

The project is developed using **Java, Object-Oriented Programming (OOP), Java Swing, ArrayList, and Java File Handling/Serialization**. Book, user, and purchase information is stored in files so that the data can remain available after the program is closed. This follows the project's blueprint, which specifies file-based persistence rather than requiring a database.

This project was developed as a university group project.
---


## 🖱️ Project Overview

Book Nest provides the following main features:

* User registration and login
* Add, view, search, update, and delete books
* Borrow and return books
* Purchase books
* Add stock to existing books
* Store user, book, and purchase information
* Display purchase information

---

## 🎯 Project Objectives

* Develop a simple and organized library management system.
* Implement the four OOP principles.
* Perform CRUD operations on books.
* Manage book quantity and stock.
* Provide user registration and login.
* Store data permanently using file handling.
* Use Java Swing for graphical user interaction.

---

## ⚙️ System Design

The project is divided into several classes, each with a specific responsibility:

| **Class**     | **Responsibility**                                                    |
| ------------- | --------------------------------------------------------------------- |
| `Main`        | Controls the main program flow and menus.                             |
| `User`        | Abstract class containing common user information.                    |
| `Reader`      | Represents a regular library user.                                    |
| `Admin`       | Represents an administrative user.                                    |
| `Book`        | Stores book information.                                              |
| `Purchase`    | Stores purchase information.                                          |
| `Library`     | Handles book management, borrowing, returning, purchasing, and stock. |
| `FileManager` | Saves and loads users, books, and purchases.                          |
| `LibraryGUI`  | Provides the Swing-based login and registration interface.            |

---

## 🧩 OOP Principles

| **Principle**     | **Implementation**                                                                         |
| ----------------- | ------------------------------------------------------------------------------------------ |
| **Encapsulation** | Private fields with getters and setters in classes such as `Book`, `User`, and `Purchase`. |
| **Abstraction**   | `User` is an abstract class with the abstract `getRole()` method.                          |
| **Inheritance**   | `Reader` and `Admin` extend `User`.                                                        |
| **Polymorphism**  | `getRole()` is overridden by `Reader` and `Admin`.                                         |

---

## 📖 Main Features

### 👤 User Authentication

Users can create accounts and log in using their username and password. Duplicate usernames and empty fields are checked during registration.

### 📚 Book Management

The system supports:

* Add Book
* Show Books
* Search Book
* Update Book
* Delete Book
* Add Stock

Each book contains a Book ID, title, author, category, price, and quantity.

### 📕 Borrow & Return

Borrowing decreases the book quantity by one, while returning increases it by one. The system prevents borrowing when a book is out of stock.

### 🛒 Purchase

Users can purchase available books. A `Purchase` object is created containing the purchase ID, book information, customer name, and price. The book quantity is then reduced.

---

## 💾 Data Persistence

Book Nest uses **Java File I/O and Serialization** instead of a database.

Data is stored in:

```text
user.dat
book.dat
purchase.dat
```

The `FileManager` class handles saving and loading these files, allowing information to remain available after the program is closed.

---

## ⚠️ Error Handling

The system handles common errors such as:

* Incorrect username or password
* Empty registration fields
* Duplicate username
* Book not found
* Book out of stock
* File loading and saving errors

`try-catch` blocks are used in `FileManager` to handle file-related errors.

---

## 🧪 Testing

The system can be tested for:

| **Test**               | **Expected Result**                   |
| ---------------------- | ------------------------------------- |
| Correct login          | Login successful                      |
| Wrong login            | Error message                         |
| Duplicate username     | Registration rejected                 |
| Search existing book   | Book information displayed            |
| Search missing book    | Book not found                        |
| Add/Update/Delete book | Book data updated correctly           |
| Borrow book            | Quantity decreases                    |
| Return book            | Quantity increases                    |
| Purchase book          | Purchase saved and quantity decreases |
| Add stock              | Quantity increases                    |
| Restart application    | Saved data remains available          |

---

## 🧰 Tools & Technologies

* **Language:** Java
* **GUI:** Java Swing
* **Collections:** ArrayList
* **Data Storage:** Java File I/O / Serialization
* **Data Files:** `.dat`
* **Concepts:** OOP, CRUD, File Handling, Exception Handling
* **Database:** Not used

---

## 🚀 Future Enhancements

Possible future improvements include:

* Complete Swing-based library dashboard
* Separate Reader and Admin interfaces
* Category-based book browsing
* Search by title, author, and category
* Purchase history
* JTable-based book management
* Custom exception classes
* MySQL or SQLite database integration
* Improved authentication and password security
* Book cover/image support

---

## 🧾 Conclusion

**Book Nest** demonstrates how Java and Object-Oriented Programming can be used to develop a practical Library Management System.

The project implements **encapsulation, abstraction, inheritance, and polymorphism**, along with CRUD operations, file handling, user authentication, stock management, borrowing, returning, and purchasing.

It provides a simple and structured foundation for managing library operations while demonstrating important Java programming concepts.
