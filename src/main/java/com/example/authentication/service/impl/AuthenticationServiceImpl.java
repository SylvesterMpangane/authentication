package com.example.authentication.service.impl;

import com.example.authentication.dto.SignInRequest;
import com.example.authentication.dto.SignUpRequest;
import com.example.authentication.model.UserEntity;
import com.example.authentication.repository.AuthenticationRepository;
import com.example.authentication.service.AuthenticationService;
import com.example.authentication.service.SignupRequestConverter;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.UUID;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    private AuthenticationRepository authenticationRepository;
    private SignupRequestConverter signupRequestConverter;

    @Override
    public String signIn(SignInRequest signInRequest) {
        UserEntity dbUser = authenticationRepository.findById(UUID.randomUUID()).orElse(null);

        if (Objects.nonNull(dbUser)) {
            if (signInRequest.password().equals(dbUser.getPassword())
                    && signInRequest.email().equals(dbUser.getPassword())) {
                return "Success!!!";
            }
        }
        return "Invalid username or password";
    }

    public String signUp(SignUpRequest signUpRequest) {
        UserEntity user = signupRequestConverter.convert(signUpRequest);
        authenticationRepository.save(user);
        return "Success!!!";
    }
}
