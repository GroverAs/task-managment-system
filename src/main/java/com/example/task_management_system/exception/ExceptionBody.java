package com.example.task_management_system.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

@Data@AllArgsConstructor
public class ExceptionBody {

    private String message;
    private Map<String, String> errors;

    public ExceptionBody(String message) {
        this.message = message;
    }
}
