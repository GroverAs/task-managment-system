package com.example.task_management_system.web.controller;

import com.example.task_management_system.model.task.Task;
import com.example.task_management_system.model.user.User;
import com.example.task_management_system.service.TaskService;
import com.example.task_management_system.service.UserService;
import com.example.task_management_system.web.dto.task.TaskDto;
import com.example.task_management_system.web.dto.user.UserDto;
import com.example.task_management_system.web.dto.validation.OnUpdate;
import com.example.task_management_system.web.mappers.TaskMapper;
import com.example.task_management_system.web.mappers.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
@Validated
public class UserController {

    private final UserService userService;
    private final TaskService taskService;

    private final UserMapper userMapper;
    private final TaskMapper taskMapper;

    @PutMapping
    public UserDto update(@Validated(OnUpdate.class) @RequestBody UserDto dto) {
        User user = userMapper.toEntity(dto);
        User updatedUser = userService.update(user);
        return userMapper.toDto(updatedUser);
    }

    @GetMapping("/{id}")
    public UserDto getById(@PathVariable Long id) {
        User user = userService.getById(id);
        return userMapper.toDto(user);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        userService.delete(id);
    }

    @GetMapping("/{id}/tasks")
    public List<TaskDto> getTasksByUserId(@PathVariable Long id) {
        List<Task> tasks = taskService.getAllByUserId(id);
        return taskMapper.toDto(tasks);
        }

        @PostMapping("/{id}/tasks")
        public TaskDto createTask(@PathVariable Long id,
                                  @Validated(OnUpdate.class) @RequestBody TaskDto dto) {
        Task task = taskMapper.toEntity(dto);
        Task createdTask = taskService.create(task, id);
        return taskMapper.toDto(createdTask);
    }

}
