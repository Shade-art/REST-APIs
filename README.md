# Journal App REST API

A simple Spring Boot REST API for managing journal entries and learning backend development fundamentals.

## Tech Stack

* Java
* Spring Boot
* Spring Web
* Maven
* Postman

## Architecture

```text
Postman
   ↓
JournalController
   ↓
JournalService
   ↓
JournalRepository
   ↓
HashMap (In-Memory Storage)
```

## Features

* Create Journal Entry
* Get All Journal Entries
* Get Journal Entry By ID
* Update Journal Entry
* Delete Journal Entry
* Layered Architecture (Controller → Service → Repository)
* Constructor-Based Dependency Injection
* 404 Response for Missing Entries

## REST Endpoints

```http
POST    /journal
GET     /journal
GET     /journal/{id}
PUT     /journal/{id}
DELETE  /journal/{id}
```

## Concepts Practiced

* REST API Design
* CRUD Operations
* Spring Boot Fundamentals
* @RestController
* @RequestMapping
* @GetMapping
* @PostMapping
* @PutMapping
* @DeleteMapping
* @PathVariable
* @RequestBody
* ResponseEntity
* @Service
* @Repository
* Dependency Injection
* Constructor Injection
* Spring Beans
* Repository Pattern
* Layered Architecture

## Future Improvements

* Spring Data JPA
* MySQL / PostgreSQL Integration
* Bean Validation
* Global Exception Handling
* Lombok
* Spring Security
* JWT Authentication
* Unit & Integration Testing

```
```
