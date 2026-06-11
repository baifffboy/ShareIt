package ru.practicum.user.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import ru.practicum.item.model.Item;

@Data
public class CreateUserRequest {
    @NotNull
    private String nickname;
    private Item demandItem;
    private Item supplyItem;
}
