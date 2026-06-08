package ru.practicum.item.model;

import ru.practicum.user.model.User;

import java.util.List;

public class Item {
    private Long id;
    private String name;
    private String description;
    private boolean isAvailable;
    private List<String> reviews;
    private User owner;
    private Long countOfRent;
}
