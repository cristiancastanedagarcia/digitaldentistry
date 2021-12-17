package com.cris.digitaldentistry.app.mapper;

import com.cris.digitaldentistry.app.dto.UserDto;
import com.cris.digitaldentistry.domain.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserDtoMapperUser {
    UserDto toUserDto(User user);

    User toUser(UserDto userDto);
}
