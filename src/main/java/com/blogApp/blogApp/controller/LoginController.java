package com.blogApp.blogApp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class LoginController {

    @GetMapping("/get")
    public ResponseEntity<?> testApi(){
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
