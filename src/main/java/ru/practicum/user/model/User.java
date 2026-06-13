package ru.practicum.user.model;

import jakarta.validation.constraints.Email;
import lombok.Data;
import ru.practicum.item.model.Item;

import java.util.ArrayList;
import java.util.List;

@Data
public class User {
    private Long id;
    private String name;
    private String email;
    private List<Item> demandItem = new ArrayList<>(); // вещи которые пользователь имеет во временном пользовании
    private List<Item> supplyItem = new ArrayList<>(); // вещи которые пользователь может предложить
    // id, никнейм юзера, какие вещи он имеет в распоряжении (взял в аренду),
    // и какие может предложить
}
