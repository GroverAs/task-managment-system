package com.example.task_management_system.repository.impl;

import com.example.task_management_system.model.user.User;
import com.example.task_management_system.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public class UserRepositoryImpl implements UserRepository {

    @Override
    public Optional<User> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<User> findUserName(String username) {
        return Optional.empty();
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void create(User user) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void insertUserRole(Long userId, Long taskId) {

    }

}
