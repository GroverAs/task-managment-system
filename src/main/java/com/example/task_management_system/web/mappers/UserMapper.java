package com.example.task_management_system.web.mappers;

import com.example.task_management_system.model.user.User;
import com.example.task_management_system.web.dto.user.UserDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toDto(User user);

    User toEntity(UserDto userDto);

}
