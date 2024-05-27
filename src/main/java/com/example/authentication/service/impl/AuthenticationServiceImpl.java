package com.example.authentication.service.impl;

import com.example.authentication.dto.SignInRequest;
import com.example.authentication.dto.SignUpRequest;
import com.example.authentication.model.UserEntity;
import com.example.authentication.repository.AuthenticationRepository;
import com.example.authentication.service.AuthenticationService;
import com.example.authentication.service.SignupRequestConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {

    private final AuthenticationRepository authenticationRepository;
    private final SignupRequestConverter signupRequestConverter;

    @Override
    public String signIn(SignInRequest signInRequest) {
        UserEntity dbUser = authenticationRepository.findByEmailIgnoreCase(signInRequest.email())
                .orElseThrow(() -> new RuntimeException("Invalid username or password"));

        if (Objects.nonNull(dbUser)
                && signInRequest.password().equals(dbUser.getPassword())) {
                return "Success!!!";
        }
        return "Invalid username or password";
    }

    public String signUp(SignUpRequest signUpRequest) {
        UserEntity user = signupRequestConverter.convert(signUpRequest);
        authenticationRepository.save(user);
        return "Success!!!";
    }
}
