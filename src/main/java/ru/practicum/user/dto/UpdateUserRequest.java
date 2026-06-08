package ru.practicum.user.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import ru.practicum.item.model.Item;

import java.util.List;

public class UpdateUserRequest {
    @Positive(message = "id не может быть отрицательным или равным 0")
    private Long id;
    private String nickname;
    private Item demandItem;
    private Item supplyItem;
}
