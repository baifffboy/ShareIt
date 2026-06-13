package ru.practicum.user.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import ru.practicum.item.model.Item;

@Data
public class CreateUserRequest {
    @NotBlank(message = "Поле name не может быть пустым")
    private String name;
    @Email
    @NotNull
    private String email;
    private Item demandItem;
    private Item supplyItem;
}
