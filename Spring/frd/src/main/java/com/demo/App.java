package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}




//GET /api/entity/friends — list all
//
//POST /api/entity/friends — create (entity-based)
//
//GET /api/entity/friends/{id} — read one
//
//PUT /api/entity/friends/{id} — update
//
//DELETE /api/entity/friends/{id} — delete
