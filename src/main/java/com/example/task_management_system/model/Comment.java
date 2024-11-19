package com.example.task_management_system.model;

import com.example.task_management_system.model.task.Task;
import com.example.task_management_system.model.user.User;

public class Comment {

    private Long id;
    private String text;
    private Task task;
    private User author;
}
