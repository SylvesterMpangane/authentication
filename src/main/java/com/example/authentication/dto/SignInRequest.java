package com.example.authentication.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record SignInRequest(
        @NotBlank() @Email() String email,
        @NotBlank() String password
) {}
