package ru.practicum.user.dto;

import lombok.Data;
import ru.practicum.item.model.Item;

import java.util.List;

@Data
public class UserDto {
    private Long id;
    private String nickname;
    private List<Item> demandItem;
    private List<Item> supplyItem;
}
