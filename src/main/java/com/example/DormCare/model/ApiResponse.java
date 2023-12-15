package com.example.DormCare.model;

public class ApiResponse {
    private String message;

    // Constructors, getter, and setter methods

    public ApiResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
