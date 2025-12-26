// src/main/java/com/example/demo/controller/MyController.java
package com.example.demo.controller;

import com.example.demo.model.MyRequest;
import org.springframework.web.bind.annotation.*;

@RestController // Marks the class as a REST Controller
@RequestMapping("/api/data") // Base path for all methods in this controller
public class MyController {

    /**
     * POST Method: Accepts MyRequest as a JSON body.
     * URL: POST http://localhost:8080/api/data/post
     */
    @PostMapping("/post")
    public String handlePostRequest(@RequestBody MyRequest request) {
        // Log or process the received data
        System.out.println("POST Request Received: Name=" + request.getName() + ", Value=" + request.getNumber());
        
        // Return a response string
        return "POST request processed successfully! Received: " 
             + "**" + request.getName() + "** with value **" + request.getNumber() + "**.";
    }

    // ----------------------------------------------------------------------

    /**
     * GET Method: Accepts MyRequest as URL query parameters.
     * URL: GET http://localhost:8080/api/data/get?name=testName&value=123
     */
    @GetMapping("/getting")
    public String handleGetRequest(@ModelAttribute MyRequest request) {
        // Log or process the received data
        System.out.println("GET Request Received: Name=" + request.getName() + ", Value=" + request.getNumber());

        // Return a response string
        return "GET request processed successfully! Parameters: " 
             + "**" + request.getName() + "** and **" + request.getNumber() + "**.";
    }
}
