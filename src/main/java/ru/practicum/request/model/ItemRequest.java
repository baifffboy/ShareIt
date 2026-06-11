package ru.practicum.request.model;

import lombok.Data;
import ru.practicum.item.model.Item;
import ru.practicum.user.model.User;

@Data
public class ItemRequest {
    private Long id;
    private Item request;
    private User requestUser;
    // запрос на вещь - id, какая вещь требуется (если ее нет должна быть создана),
    // запрос актуален?- удалил так как если запрос не актуален пользователь просто удалит его,
    // юзер который запрашивает вещь
}
