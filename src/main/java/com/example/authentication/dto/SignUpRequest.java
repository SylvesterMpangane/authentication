package com.example.authentication.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;

@Builder
public record SignUpRequest(
        @NotBlank() @Email() String email,
        @NotBlank() String password,
        @NotBlank() String name,
        @NotBlank() String surname
) {}
