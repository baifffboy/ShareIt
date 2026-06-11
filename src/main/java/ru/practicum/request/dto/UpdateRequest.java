package ru.practicum.request.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import ru.practicum.item.model.Item;
import ru.practicum.user.model.User;

@Data
public class UpdateRequest {
    @Positive(message = "id не может быть отрицательным или равным 0")
    private Long id;
    @NotNull
    private Item request;
    private boolean isActual;
    @NotNull
    private User requestUser;
}
