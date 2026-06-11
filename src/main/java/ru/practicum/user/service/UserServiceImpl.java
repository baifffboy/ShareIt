package ru.practicum.user.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.practicum.exception.NotFoundException;
import ru.practicum.user.dao.UserRepository;
import ru.practicum.user.dto.CreateUserRequest;
import ru.practicum.user.dto.UpdateUserRequest;
import ru.practicum.user.dto.UserDto;
import ru.practicum.user.mapper.UserMapper;
import ru.practicum.user.model.User;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserDto create(CreateUserRequest createUserRequest) {
        User user = UserMapper.mapToUser(createUserRequest);
        User savedUser = userRepository.save(user);
        log.info("Создан пользователь с id: {}", savedUser.getId());
        return UserMapper.mapToUserDto(savedUser);
    }

    @Override
    public UserDto findById(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Пользователь с id " + id + " не найден"));
        return UserMapper.mapToUserDto(user);
    }

    @Override
    public List<UserDto> findAll() {
        return userRepository.findAll().stream()
                .map(UserMapper::mapToUserDto)
                .collect(Collectors.toList());
    }

    @Override
    public UserDto update(UpdateUserRequest updateUserRequest) {
        User existingUser = userRepository.findById(updateUserRequest.getId())
                .orElseThrow(() -> new NotFoundException("Пользователь с id " + updateUserRequest.getId() + " не найден"));

        if (updateUserRequest.getNickname() != null) {
            existingUser.setNickname(updateUserRequest.getNickname());
        }
        if (updateUserRequest.getDemandItem() != null) {
            existingUser.setDemandItem(List.of(updateUserRequest.getDemandItem()));
        }
        if (updateUserRequest.getSupplyItem() != null) {
            existingUser.setSupplyItem(List.of(updateUserRequest.getSupplyItem()));
        }

        User updatedUser = userRepository.update(existingUser);
        log.info("Обновлен пользователь с id: {}", updatedUser.getId());
        return UserMapper.mapToUserDto(updatedUser);
    }

    @Override
    public void delete(Long id) {
        if (!userRepository.existsById(id)) {
            throw new NotFoundException("Пользователь с id " + id + " не найден");
        }
        userRepository.delete(id);
        log.info("Удален пользователь с id: {}", id);
    }
}