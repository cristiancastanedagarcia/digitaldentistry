package com.cris.digitaldentistry.app.service;

import com.cris.digitaldentistry.app.dto.UserDto;
import com.cris.digitaldentistry.app.mapper.UserDtoMapperUser;
import com.cris.digitaldentistry.domain.service.UserDomainServiceInterface;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserServiceImpl implements UserServiceInterface{
    private final UserDomainServiceInterface userDomainServiceInterface;
    private final UserDtoMapperUser userDtoMapperUser;
    @Override
    public UserDto findUserById(Integer id) {
        return userDtoMapperUser.toUserDto(userDomainServiceInterface.findBookById(id));
    }
}
