package com.example.authentication.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record SignUpRequest(
        @NotBlank() @Email() String email,
        @NotBlank() String password,
        @NotBlank() String fullName,

        @NotBlank() String name,

        @NotBlank() String surname
) {}
