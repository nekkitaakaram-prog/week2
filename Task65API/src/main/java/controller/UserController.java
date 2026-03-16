package controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import model.User;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class UserController {

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@Valid @RequestBody User user) {

        return ResponseEntity.ok("User Registered Successfully");

    }
}