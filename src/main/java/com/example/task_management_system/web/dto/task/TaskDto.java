package com.example.task_management_system.web.dto.task;

import com.example.task_management_system.model.task.Priority;
import com.example.task_management_system.model.task.Status;
import com.example.task_management_system.model.user.User;
import com.example.task_management_system.web.dto.validation.OnCreate;
import com.example.task_management_system.web.dto.validation.OnUpdate;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class TaskDto {

    @NotNull(message = "Id must not be null", groups = OnUpdate.class)
    private Long id;

    @NotNull(message = "Title must not be null", groups = {OnCreate.class, OnUpdate.class})
    @Length(max = 255, message = "Title  length must be smaller than 255 symbols", groups = {OnCreate.class, OnUpdate.class})
    private String title;

    @Length(max = 255, message = "Description length must be smaller than 255 symbols", groups = {OnCreate.class, OnUpdate.class})
    private String description;

    private Status status;

    @NotNull(message = "Priority must not be null")
    private Priority priority;

    @NotNull(message = "Author must not be null")
    private User author;

    @NotNull(message = "Assignee person must not be null")
    private User assignee;

}
