package ru.practicum.request.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import ru.practicum.item.model.Item;
import ru.practicum.user.model.User;

@Data
public class CreateRequest {
    @NotNull
    private Item request;
    @NotNull
    private User requestUser;
}
