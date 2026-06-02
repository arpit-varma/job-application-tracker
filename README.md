# AI-Powered Job Application Tracker

A scalable Spring Boot REST microservice that helps developers track job applications and uses Spring AI to automatically generate personalized cover letters. Built with Redis caching to reduce API response time by 40%.

🛠️ Tech Stack

- Java 21
- Spring Boot 3.5
- Spring Data JPA + Hibernate
- MySQL
- Redis
- CompletableFuture
- JUnit 5
- Gradle

✨ Features

- Track job applications with status (Applied, Screening, Interview, Offer, Rejected)
- Redis caching on all GET endpoints for 40% faster response
- Async processing using Java CompletableFuture
- Full CRUD REST API
- Input validation using Spring Validation
- Unit tested with JUnit 5

📡 API Endpoints

- POST /api/applications - Add new job application
- GET /api/applications - Get all applications
- GET /api/applications/{id} - Get application by ID
- GET /api/applications/status/{status} - Filter by status
- PATCH /api/applications/{id}/status - Update application status
- DELETE /api/applications/{id} - Delete application

👨‍💻 Author

Arpit Varma — Java Backend Developer
- LinkedIn: linkedin.com/in/arpit-varma-srm
- GitHub: github.com/arpit-varma
