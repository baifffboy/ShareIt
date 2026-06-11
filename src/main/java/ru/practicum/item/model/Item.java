package ru.practicum.item.model;

import lombok.Data;
import ru.practicum.user.model.User;

import java.util.List;

@Data
public class Item {
    private Long id;
    private String name;
    private String description;
    private boolean isAvailable;
    private List<String> reviews;
    private User owner;
    private Long countOfRent;
    // класс вещи - id, навзание вещи, описание, доступна?,
    // отзыв - можно оставить помле того кк вещь отдали обратно
    // хозяин вещи, количество аренд
}
