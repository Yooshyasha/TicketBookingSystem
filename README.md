# Ticket Booking System

Простая система бронирования билетов на публичные мероприятия.

## 🚀 Стек технологий

- Java 17
- Spring Boot
- PostgreSQL
- JPA (Hibernate)
- Swagger
- Docker Compose

## 📦 Запуск

```bash
git clone https://github.com/Yooshyasha/TicketBookingSystem.git
cd TicketBookingSystem
echo .env.example > .env
.\mvnw package -DskipTests
docker-compose up --build
```