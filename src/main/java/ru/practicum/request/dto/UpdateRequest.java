package ru.practicum.request.dto;

import jakarta.validation.constraints.Positive;
import ru.practicum.item.model.Item;
import ru.practicum.user.model.User;

public class UpdateRequest {
    @Positive(message = "id не может быть отрицательным или равным 0")
    private Long id;
    private Item request;
    private boolean isActual;
    private User requestUser;
}
