package com.cris.digitaldentistry.app.service;

import com.cris.digitaldentistry.app.dto.UserDto;

public interface UserServiceInterface {
    UserDto findUserById(Integer id);
}
