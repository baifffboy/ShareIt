package ru.practicum.request.dto;

import ru.practicum.item.model.Item;
import ru.practicum.user.model.User;

public class RequestDto {
    private Long id;
    private Item request;
    private boolean isActual;
    private User requestUser;
}
