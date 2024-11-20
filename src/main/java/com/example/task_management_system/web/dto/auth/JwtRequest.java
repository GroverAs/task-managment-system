package com.example.task_management_system.web.dto.auth;

import lombok.Data;

@Data
public class JwtRequest {

    private String userName;

    private String password;

}
