package ru.practicum.request.model;

import ru.practicum.item.model.Item;
import ru.practicum.user.model.User;

import java.util.List;

public class ItemRequest {
    private Long id;
    private Item request;
    private boolean isActual;
    private User requestUser;
}
