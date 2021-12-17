package com.cris.digitaldentistry.domain.repository;

import com.cris.digitaldentistry.domain.entity.User;

public interface UserRepository {
    User getById(Integer id);
}
