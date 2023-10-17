package com.jwt.jwtauth.auth;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {
    
    @GetMapping("/dashboard")
    public ResponseEntity<String> securedApi(){
        return ResponseEntity.ok("Ini dashboard page secured");
    }
}
