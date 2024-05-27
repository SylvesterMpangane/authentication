package com.example.authentication.service;

import com.example.authentication.dto.SignUpRequest;
import com.example.authentication.model.UserEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class SignupRequestConverter implements Converter<SignUpRequest, UserEntity>{
    @Override
    public UserEntity convert(SignUpRequest signUpRequest) {
        if (Objects.nonNull(signUpRequest)) {
            UserEntity userEntity = new UserEntity();
            BeanUtils.copyProperties(signUpRequest, userEntity);
            return userEntity;
        }
        return null;
    }
}
