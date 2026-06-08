package ru.practicum.item.dto;

import ru.practicum.user.model.User;

import java.util.List;

public class ItemDto {
    private Long id;
    private String name;
    private String description;
    private boolean isAvailable;
    private List<String> reviews;
    private Long countOfRent;
}
