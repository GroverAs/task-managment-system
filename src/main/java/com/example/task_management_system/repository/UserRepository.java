package com.example.task_management_system.repository;

import com.example.task_management_system.model.user.Role;
import com.example.task_management_system.model.user.User;

import java.util.Optional;
import java.util.Set;

public interface UserRepository {

    Optional<User> findById(Long id);

    Optional<User> findByUserName(String username);

    void update(User user);

    void create(User user);

    void delete(Long id);

    void insertUserRole(Long userId, Role role);

    boolean isTaskOwner(Long userId, Long taskId);
}
