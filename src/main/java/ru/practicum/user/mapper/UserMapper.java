package ru.practicum.user.mapper;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import ru.practicum.user.dto.CreateUserRequest;
import ru.practicum.user.dto.UpdateUserRequest;
import ru.practicum.user.dto.UserDto;
import ru.practicum.user.model.User;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserMapper {

    public static UserDto mapToUserDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setNickname(user.getNickname());
        userDto.setDemandItem(user.getDemandItem());
        userDto.setSupplyItem(user.getSupplyItem());
        return userDto;
    }

    public static User mapToUser(CreateUserRequest createUserRequest) {
        User user = new User();
        user.setNickname(createUserRequest.getNickname());
        if (createUserRequest.getDemandItem() != null) {
            user.setDemandItem(java.util.List.of(createUserRequest.getDemandItem()));
        }
        if (createUserRequest.getSupplyItem() != null) {
            user.setSupplyItem(java.util.List.of(createUserRequest.getSupplyItem()));
        }
        return user;
    }

    public static User mapToUser(UpdateUserRequest updateUserRequest) {
        User user = new User();
        user.setId(updateUserRequest.getId());
        user.setNickname(updateUserRequest.getNickname());
        if (updateUserRequest.getDemandItem() != null) {
            user.setDemandItem(java.util.List.of(updateUserRequest.getDemandItem()));
        }
        if (updateUserRequest.getSupplyItem() != null) {
            user.setSupplyItem(java.util.List.of(updateUserRequest.getSupplyItem()));
        }
        return user;
    }
}