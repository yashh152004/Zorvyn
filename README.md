
🚀 Finance Dashboard API

A secure and scalable backend system for managing financial data

📌 Overview

Finance Dashboard API is a Spring Boot backend application that enables users to manage income and expenses securely. It implements JWT authentication, role-based access control, and efficient database operations using MySQL.

✨ Features

🔐 JWT Authentication & Authorization
👥 Role-Based Access (ADMIN, ANALYST, VIEWER)
🗄️ MySQL + JPA Integration
🚀 Future Enhancements
📊 Analytics Dashboard

🛠️ Tech Stack
Backend: Spring Boot
Security: Spring Security + JWT
Database: MySQL
ORM: Hibernate (JPA)
Build Tool: Maven
Java: 21

📁 Project Structure

com.internship_zorvyn.demo
├── controller
├── service
├── repository
├── model
├── dto
├── security
└── DemoApplication

🔑 API Endpoints

Authentication
POST /api/auth/login
Financial Records
POST /records              # Create record  
GET  /records              # Get records  
GET  /records/summary      # Get income & expense summary  

📥 Sample Request

<img width="1904" height="1011" alt="Screenshot 2026-04-06 012047" src="https://github.com/user-attachments/assets/ea86d90c-287e-4048-bba5-81336e338d7a" />


🔐 Authorization

Authorization: Bearer <JWT_TOKEN>

⚙️ Setup

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

Yashwardhan Kumar
Backend Developer | Spring Boot | AI Enthusiast

⭐ Summary

A production-ready backend system demonstrating secure API development, clean architecture, and real-world financial data handling build by me and took some help from ai tools.

