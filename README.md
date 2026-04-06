# 🚀 Finance Dashboard API

## A Secure & Scalable Backend System for Financial Management

### 📌 Overview

Finance Dashboard API is a Spring Boot backend application designed to manage financial data such as income and expenses.
It integrates JWT-based authentication, role-based access control, and MySQL database operations to ensure security and performance.

### ✨ Key Features

🔐 JWT Authentication & Authorization
👥 Role-Based Access Control (ADMIN, ANALYST, VIEWER)
💰 Income & Expense Management
📊 Pagination & Data Filtering
📈 Financial Summary (Income vs Expense)
🗄️ MySQL Integration with JPA/Hibernate

### 🛠️ Tech Stack

Backend: Spring Boot
Security: Spring Security + JWT
Database: MySQL
ORM: Hibernate (JPA)
Build Tool: Maven
Java Version: 21

### 📁 Project Structure

com.internship_zorvyn.demo

├── controller        # API endpoints
├── service           # Business logic
├── repository        # Database layer
├── model             # Entity classes
├── dto               # Request/Response DTOs
├── security          # JWT & security config
└── DemoApplication   # Main entry point

### 🔑 API Endpoints

🔐 Authentication
POST /api/auth/login
💰 Financial Records
POST   /records              → Create record  

GET    /records              → Fetch records (pagination)  

GET    /records/summary      → Income & Expense summary  

### 📥 Sample Request

<img width="1904" height="1011" alt="Screenshot 2026-04-06 012047" src="https://github.com/user-attachments/assets/ea86d90c-287e-4048-bba5-81336e338d7a" />


### 🔐 Authorization

Authorization: Bearer <JWT_TOKEN>

### ⚙️ Setup

git clone <repo-url>
cd finance-dashboard
mvn spring-boot:run

Database Config (application.properties):

spring.datasource.url=jdbc:mysql://localhost:3306/finance_db
spring.datasource.username=root
spring.datasource.password=your_password

🚀 Future Enhancements
📊 Analytics Dashboard
🤖 AI Expense Categorization
📱 Frontend Integration
📈 Monthly Insights
👨‍💻 Author

## Yashwardhan Kumar
Backend Developer | Spring Boot | AI Enthusiast

## ⭐ Summary

A production-ready backend system demonstrating secure API development, clean architecture, and real-world financial data handling build by me and took some help from ai tools.

