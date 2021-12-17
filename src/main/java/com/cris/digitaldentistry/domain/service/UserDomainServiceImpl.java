package com.cris.digitaldentistry.domain.service;

import com.cris.digitaldentistry.domain.entity.User;
import com.cris.digitaldentistry.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserDomainServiceImpl implements UserDomainServiceInterface {
    private final UserRepository userRepository;

    @Override
    public User findBookById(Integer id) {
        return userRepository.getById(id);
    }
}
