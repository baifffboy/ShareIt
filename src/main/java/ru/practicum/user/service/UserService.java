package ru.practicum.user.service;

import ru.practicum.user.dto.CreateUserRequest;
import ru.practicum.user.dto.UpdateUserRequest;
import ru.practicum.user.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto create(CreateUserRequest createUserRequest);

    UserDto findById(Long id);

    List<UserDto> findAll();

    UserDto update(UpdateUserRequest updateUserRequest);

    void delete(Long id);
}