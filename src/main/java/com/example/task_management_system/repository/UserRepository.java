package com.example.task_management_system.repository;

import com.example.task_management_system.model.user.User;

import java.util.Optional;

public interface UserRepository {

    Optional<User> findById(Long id);

    Optional<User> findUserName(String username);

    void update(User user);

    void create(User user);

    void delete(Long id);

    void insertUserRole(Long userId, Long taskId);
}
