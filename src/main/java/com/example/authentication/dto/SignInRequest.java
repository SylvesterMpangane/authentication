package com.example.authentication.dto;

public record SignInRequest(
        String email,
        String password
) {}
