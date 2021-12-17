package com.cris.digitaldentistry.infrastructure.configuration;

import com.cris.digitaldentistry.app.mapper.UserDtoMapperUser;
import com.cris.digitaldentistry.app.service.UserServiceImpl;
import com.cris.digitaldentistry.domain.repository.UserRepository;
import com.cris.digitaldentistry.domain.service.UserDomainServiceImpl;
import com.cris.digitaldentistry.domain.service.UserDomainServiceInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public UserServiceImpl userService(UserDomainServiceInterface userDomainServiceInterface, UserDtoMapperUser userDtoMapperUser) {
        return new UserServiceImpl(userDomainServiceInterface, userDtoMapperUser);
    }

    @Bean
    public UserDomainServiceImpl userDomainServiceImpl(UserRepository userRepository) {
        return new UserDomainServiceImpl(userRepository);
    }
}
