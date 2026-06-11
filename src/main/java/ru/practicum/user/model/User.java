package ru.practicum.user.model;

import lombok.Data;
import ru.practicum.item.model.Item;

import java.util.List;

@Data
public class User {
    private Long id;
    private String nickname;
    private List<Item> demandItem; // вещи которые пользователь имеет во временном пользовании
    private List<Item> supplyItem; // вещи которые пользователь может предложить
    // id, никнейм юзера, какие вещи он имеет в распоряжении (взял в аренду),
    // и какие может предложить
}
