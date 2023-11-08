package com.example.turagency_back.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public ResponseEntity get_user(){
        try {
            return ResponseEntity.ok("all ok");
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body("Something went wrong");
        }
    }
}