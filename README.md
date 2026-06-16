# Journal App REST API

A simple Spring Boot REST API for managing journal entries.

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
Controller
   ↓
Service
   ↓
HashMap
```

## Features

* Create Journal Entry
* Get All Entries
* Get Entry By ID
* Update Entry
* Delete Entry
* 404 Response for Missing Entries

## Endpoints

```http
POST    /journal
GET     /journal
GET     /journal/{id}
PUT     /journal/{id}
DELETE  /journal/{id}
```

## Concepts Learned

* REST APIs
* CRUD Operations
* @RestController
* @RequestMapping
* @GetMapping / @PostMapping
* @PutMapping / @DeleteMapping
* @PathVariable
* @RequestBody
* ResponseEntity
* @Service
* Dependency Injection
* Constructor Injection
* Layered Architecture

## Next Steps

* Repository Layer
* Spring Data JPA
* MySQL
* Validation
* Exception Handling
* Spring Security & JWT
