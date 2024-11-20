package com.example.task_management_system.web.dto.user;

import lombok.Data;

@Data
public class UserDto {

    private Long id;
    private String email;
    private String password;
    private String passwordConfirmation;

}
