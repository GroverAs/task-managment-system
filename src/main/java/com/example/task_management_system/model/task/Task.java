package com.example.task_management_system.model.task;

import com.example.task_management_system.model.Comment;
import com.example.task_management_system.model.user.User;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class Task {

    private Long id;

    private String title;

    private String description;

    private Status status;

    private Priority priority;

    private User author;

    private User assignee;

    private List<Comment> comments = new ArrayList<>();
}
