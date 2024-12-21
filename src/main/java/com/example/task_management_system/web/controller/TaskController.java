package com.example.task_management_system.web.controller;

import com.example.task_management_system.model.task.Task;
import com.example.task_management_system.service.TaskService;
import com.example.task_management_system.web.dto.task.TaskDto;
import com.example.task_management_system.web.dto.validation.OnUpdate;
import com.example.task_management_system.web.mappers.TaskMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/tasks")
@RequiredArgsConstructor
@Validated
public class TaskController {

    private final TaskService taskService;

    private final TaskMapper taskMapper;

    @GetMapping("/{id}")
    public TaskDto getById(@PathVariable Long id) {
        Task task = taskService.getById(id);
        return taskMapper.toDto(task);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        taskService.delete(id);
    }

    @PutMapping
    public TaskDto update(@Validated(OnUpdate.class) @RequestBody TaskDto dto) {
        Task task = taskMapper.toEntity(dto);
        Task updstedTask = taskService.update(task);
        return taskMapper.toDto(updstedTask);
    }

}
