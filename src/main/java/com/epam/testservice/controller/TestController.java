package com.epam.testservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/")
public class TestController {

    @GetMapping
    public ResponseEntity<String> index() {
        String response = "This response is given by the index method. Time: " + LocalDateTime.now().toString();
        return new ResponseEntity<String>(response, HttpStatus.OK);
    }

    @GetMapping(path = "path")
    public ResponseEntity<String> path() {
        String response = "This response is given by the path method. Time: " + LocalDateTime.now().toString();
        return new ResponseEntity<String>(response, HttpStatus.OK);
    }
}
