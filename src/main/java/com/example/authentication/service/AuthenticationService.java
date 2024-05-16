package com.example.authentication.service;

import com.example.authentication.dto.SignInRequest;
import com.example.authentication.dto.SignUpRequest;

public interface AuthenticationService {
    String signIn(SignInRequest signInRequest);
    String signUp(SignUpRequest signUpRequest);
}
