package ru.practicum.item.mapper;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import ru.practicum.item.dto.CreateItemRequest;
import ru.practicum.item.dto.ItemDto;
import ru.practicum.item.dto.UpdateItemRequest;
import ru.practicum.item.model.Item;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ItemMapper {
    public static ItemDto mapToItemDto(Item item) {
        ItemDto itemDto = new ItemDto();
        itemDto.setId(item.getId());
        itemDto.setName(itemDto.getName());
        itemDto.setDescription(itemDto.getDescription());
        itemDto.setAvailable(itemDto.isAvailable());
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

    public static Item mapToItem(UpdateItemRequest updateItemRequest) {
        Item item = new Item();
        item.setId(updateItemRequest.getId());
        item.setName(updateItemRequest.getName());
        item.setDescription(updateItemRequest.getDescription());
        if (updateItemRequest.getReview() != null) item.getReviews().add(updateItemRequest.getReview());
        return item;
    }
}
