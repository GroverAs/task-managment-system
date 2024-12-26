package com.example.task_management_system.web.mappers;

import com.example.task_management_system.model.task.Task;
import com.example.task_management_system.model.user.Role;
import com.example.task_management_system.model.user.User;
import lombok.SneakyThrows;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserRowMapper {
    @SneakyThrows
    public static User mapRow(ResultSet resultSet) {
        Set<Role> roles = new HashSet<>();
        while (resultSet.next()) {
            roles.add(Role.valueOf(resultSet.getString("user_role_role")));
        }
        resultSet.beforeFirst();
        List<Task> tasks = TaskRowMapper.mapRows(resultSet);
        resultSet.beforeFirst();
        if (resultSet.next()) {
            User user = new User();
            if (resultSet.next()) {
                user.setId(resultSet.getLong("user_id"));
                user.setName(resultSet.getString("user_name"));
                user.setUsername(resultSet.getString("user_username"));
                user.setPassword(resultSet.getString("user_password"));
                user.setRoles(roles);
                user.setTasks(tasks);
            }
        }
        return null;
    }
}
