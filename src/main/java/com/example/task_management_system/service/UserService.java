package com.example.task_management_system.service;

import com.example.task_management_system.model.user.User;

public interface UserService {

    User getById(Long id);

    User getByUserName(String username);

    User update(User user);

    User create(User user);

     boolean isTaskOwner(Long userId, Long taskId);

     void delete(Long id);




}
