package ru.practicum.user.dto;

import ru.practicum.item.model.Item;

import java.util.List;

public class UserDto {
    private Long id;
    private String nickname;
    private List<Item> demandItem;
    private List<Item> supplyItem;
}
