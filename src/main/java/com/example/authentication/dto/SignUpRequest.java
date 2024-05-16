package com.example.authentication.dto;

import jakarta.validation.constraints.NotBlank;

public record SignUpRequest(
        String email,
        String password,
        @NotBlank String fullName,

        String name,

        String surname
) {}
