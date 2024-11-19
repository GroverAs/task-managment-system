package com.example.task_management_system.model.user;

import com.example.task_management_system.model.task.Task;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class User {
    private Long id;
    private String email;
    private String password;
    private String passwordConfirmation;
    private Set<Role> role;
    private List<Task> authoredTasks;
    private List<Task> assignedTasks;
}
