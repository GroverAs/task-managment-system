package com.example.task_management_system.web.dto.task;

import com.example.task_management_system.model.task.Priority;
import com.example.task_management_system.model.task.Status;
import com.example.task_management_system.model.user.User;
import lombok.Data;

@Data
public class TaskDto {

    private Long id;

    private String title;

    private String description;

    private Status status;

    private Priority priority;

    private User author;

    private User assignee;

}
