// src/main/java/com/example/demo/model/MyRequest.java
package com.example.demo.model;

@Entity
public class MyRequest {
    private String name;
    private int number;

    // Default constructor (required by some frameworks like Jackson)
    public MyRequest() {
    }

    // All-args constructor
    public MyRequest(String name, int number) {
        this.name = name;
        this.number = number;
    }

    // Getters and Setters (REQUIRED for Spring/Jackson to work)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
