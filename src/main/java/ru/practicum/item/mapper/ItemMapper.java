package ru.practicum.item.mapper;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import ru.practicum.item.dto.CreateItemRequest;
import ru.practicum.item.dto.ItemDto;
import ru.practicum.item.model.Item;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ItemMapper {
    public static ItemDto mapToItemDto(Item item) {
        ItemDto itemDto = new ItemDto();
        itemDto.setId(item.getId());
        itemDto.setName(item.getName());
        itemDto.setDescription(item.getDescription());
        itemDto.setAvailable(item.isAvailable());
        itemDto.setReviews(item.getReviews());
        itemDto.setCountOfRent(item.getCountOfRent());
        return itemDto;
    }

    public static Item mapToItem(CreateItemRequest createItemRequest) {
        Item item = new Item();
        item.setName(createItemRequest.getName());
        item.setDescription(createItemRequest.getDescription());
        return item;
    }
}