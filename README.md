# Secure Login System

## Overview

This project is a simple Secure Login System developed in Java. It demonstrates the basic concepts of user authentication, password validation, session management, and logout functionality. The project is designed for beginners to understand how a secure login process works.

## Features

* User Registration
* User Login Authentication
* Password Validation (Minimum 8 Characters)
* Session Creation after Successful Login
* Logout Functionality
* Basic Input Validation

## Technologies Used

* Java
* Scanner Class
* Conditional Statements (if-else)
* Boolean Variables

## Project Workflow

1. User registers with a username and password.
2. The password is validated to ensure it contains at least 8 characters.
3. Registration is completed successfully.
4. The user logs in using the registered credentials.
5. If the username and password match, a session is created.
6. The user can log out by typing **LOGOUT**, which destroys the session.

## Project Structure

```
secure-login-system/
│
├── Main.java
├── README.md
└── .gitignore
```

## Sample Input

```
=== Registration ===
Enter Username: Jeeva
Enter Password: Jeeva@123

=== Login ===
Enter Username: Jeeva
Enter Password: Jeeva@123

Type LOGOUT to exit:
LOGOUT
```

## Sample Output

```
Registration Successful!

Login Successful
Session Created

Session Destroyed
Logged Out Successfully
```

## Learning Outcomes

* Understanding user authentication
* Password validation
* Login verification
* Session management
* Logout process
* Basic Java programming concepts

## Future Improvements

* Store passwords using hashing (e.g., BCrypt)
* Connect to a database instead of temporary variables
* Add SQL Injection protection
* Implement Two-Factor Authentication (2FA)
* Develop a graphical user interface or web application
