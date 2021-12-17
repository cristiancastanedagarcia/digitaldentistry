package com.cris.digitaldentistry.domain.service;

import com.cris.digitaldentistry.domain.entity.User;

public interface UserDomainServiceInterface {
    User findBookById(Integer id);
}
