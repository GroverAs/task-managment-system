package com.example.task_management_system.service;

import com.example.task_management_system.model.task.Task;

public interface TaskService {
    
    Task getById(Long id);

    Task getAllByUserName(Long id);

    Task update(Task task);

    Task create(Task task);

    void delete(Long id);
}
