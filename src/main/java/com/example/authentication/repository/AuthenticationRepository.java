package com.example.authentication.repository;

import com.example.authentication.model.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AuthenticationRepository extends CrudRepository<UserEntity, Long> {
}
