package ru.practicum.user.model;

import ru.practicum.item.model.Item;

import java.util.List;

public class User {
    private Long id;
    private String nickname;
    private List<Item> demandItem;
    private List<Item> supplyItem;
}
