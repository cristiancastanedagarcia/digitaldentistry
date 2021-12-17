package com.cris.digitaldentistry.infrastructure.controller;

import com.cris.digitaldentistry.app.dto.UserDto;
import com.cris.digitaldentistry.app.service.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserServiceInterface userServiceInterface;

    @GetMapping("/{documentId}")
    public ResponseEntity<UserDto> findUserById(@PathVariable Integer documentId) {
        UserDto userDto = userServiceInterface.findUserById(documentId);
        return ResponseEntity.status(HttpStatus.OK).body(userDto);
    }
}
