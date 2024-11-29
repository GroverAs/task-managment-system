package com.example.task_management_system.service;

import com.example.task_management_system.model.task.Task;

import java.util.List;

public interface TaskService {
    
    Task getById(Long id);

    List<Task> getAllByUserId(Long id);

    Task update(Task task);

    Task create(Task task, Long userId);

    void delete(Long id);
}
