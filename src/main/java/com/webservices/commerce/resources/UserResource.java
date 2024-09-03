package com.webservices.commerce.resources;

import com.webservices.commerce.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L, "Uncle Bob", "bob@example.com", "99999999", "unclebob");
        return ResponseEntity.ok().body(user);
    }

}
