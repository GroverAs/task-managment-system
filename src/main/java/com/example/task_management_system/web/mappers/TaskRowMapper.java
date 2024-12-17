package com.example.task_management_system.web.mappers;

import com.example.task_management_system.model.task.Status;
import com.example.task_management_system.model.task.Task;
import lombok.SneakyThrows;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class TaskRowMapper {

    public static void mapSingleRow(ResultSet resultSet) throws SQLException {
        Task task = new Task();
        task.setTitle(resultSet.getString("task_title"));
        task.setDescription(resultSet.getString("task_description"));
        task.setStatus(Status.valueOf(resultSet.getString("task_status")));
        Timestamp timestamp = resultSet.getTimestamp("task_expiration_date");
        if (timestamp != null) {
            task.setExpirationDate(timestamp.toLocalDateTime());
        }
    }

    @SneakyThrows
    public static Task mapRow(ResultSet resultSet) {
        if (resultSet.next()) {
            Task task = new Task();
            task.setId(resultSet.getLong("task_id"));
            mapSingleRow(resultSet);
            return task;
        }
        return null;
    }

    @SneakyThrows
    public static List<Task> mapRows(ResultSet resultSet) {
        List<Task> tasks = new ArrayList<>();
        while (resultSet.next()) {
            Task task = new Task();
            task.setId(resultSet.getLong("task_id"));
            if (resultSet.wasNull()) {
                mapSingleRow(resultSet);
                tasks.add(task);
            }
        }
        return null;
    }
}
