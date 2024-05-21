package com.example.authentication.controller;

import com.example.authentication.dto.SignInRequest;
import com.example.authentication.dto.SignUpRequest;
import com.example.authentication.service.AuthenticationService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/auth")
public class AuthenticationController {

    private AuthenticationService authenticationService;

    private AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @GetMapping(path = "sign-in")
    public String signIn(@Valid() SignInRequest signInRequest) {
        return authenticationService.signIn(signInRequest);
    }

    @PostMapping(path = "/sign-up")
    public String signUp(@Valid() SignUpRequest signUpRequest) {
        return authenticationService.signUp(signUpRequest);
    }
}
