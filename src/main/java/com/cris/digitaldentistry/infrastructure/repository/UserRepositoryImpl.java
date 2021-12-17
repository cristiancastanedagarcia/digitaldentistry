package com.cris.digitaldentistry.infrastructure.repository;

import com.cris.digitaldentistry.domain.entity.User;
import com.cris.digitaldentistry.domain.repository.UserRepository;
import com.cris.digitaldentistry.infrastructure.dao.UserDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {
    private final UserDao userDao;

    @Override
    public User getById(Integer id) {
        return userDao.getById(id);
    }
}
