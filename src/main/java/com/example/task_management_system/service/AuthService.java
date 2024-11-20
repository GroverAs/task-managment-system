package com.example.task_management_system.service;

import com.example.task_management_system.web.dto.auth.JwtRequest;
import com.example.task_management_system.web.dto.auth.JwtResponse;

public interface AuthService {

    JwtResponse login(JwtRequest loginRequest);

    JwtResponse refresh(String refreshToken);

}
