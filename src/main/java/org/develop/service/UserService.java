package org.develop.service;

import jakarta.enterprise.context.ApplicationScoped;
import org.develop.entity.UserEntity;

@ApplicationScoped
public class UserService {

    public UserEntity createUser(UserEntity userEntity) {
        UserEntity.persist(userEntity);
        return userEntity;
    }
}
