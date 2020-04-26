package com.lesson7.repository;

import com.lesson7.domain.UserEntity;

public interface UserRepository {
    UserEntity getById(long id);

    UserEntity save(UserEntity e);

    UserEntity deleteById(long id);

    UserEntity delete(UserEntity e);
}
