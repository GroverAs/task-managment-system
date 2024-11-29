package com.example.task_management_system.service;

import com.example.task_management_system.exeption.ResourceNotFoundException;
import com.example.task_management_system.model.task.Status;
import com.example.task_management_system.model.task.Task;
import com.example.task_management_system.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    @Override
    @Transactional(readOnly = true)
    public Task getById(Long id) {
        return taskRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Task not found"));
    }


    @Override
    @Transactional(readOnly = true)
    public List<Task> getAllByUserId(Long id) {
        return taskRepository.findAllByUserId(id);
    }

    @Override
    @Transactional
    public Task update(Task task) {
        if (task.getStatus() == null) {
            task.setStatus(Status.WAITING);
            taskRepository.update(task);
        }
        return task;
    }

    @Override
    @Transactional
    public Task create(Task task, Long userId) {
        task.setStatus(Status.WAITING);
        taskRepository.create(task);
        taskRepository.assignToUserById(task.getId(), userId);
        return task;
    }

    @Override
    @Transactional
    public void delete(Long id) {
        taskRepository.delete(id);

    }

}
