package com.cris.digitaldentistry.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDto {
    private Integer documentId;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
}
