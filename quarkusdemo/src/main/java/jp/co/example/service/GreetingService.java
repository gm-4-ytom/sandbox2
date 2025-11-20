package jp.co.example.service;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {
    static final String message = "Good Morning, world!!";

    public String getMessage() {
        return message;
    }
}