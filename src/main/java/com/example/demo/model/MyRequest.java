// src/main/java/com/example/demo/model/MyRequest.java
package com.example.demo.model;

@Entity
public class MyRequest {
    private String name;
    private int value;

    // Default constructor (required by some frameworks like Jackson)
    public MyRequest() {
    }

    // All-args constructor
    public MyRequest(String name, int value) {
        this.name = name;
        this.value = value;
    }

    // Getters and Setters (REQUIRED for Spring/Jackson to work)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
