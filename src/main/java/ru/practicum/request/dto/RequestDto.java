package ru.practicum.request.dto;

import lombok.Data;
import ru.practicum.item.model.Item;
import ru.practicum.user.model.User;

@Data
public class RequestDto {
    private Long id;
    private Item request;
    private boolean isActual;
    private User requestUser;
}
