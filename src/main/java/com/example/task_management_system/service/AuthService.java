package com.example.task_management_system.service;

public interface AuthService {

    JwtResponce login(JwtRequest loginRequest);

    JwtResponce refresh(String refreshToken);

}
