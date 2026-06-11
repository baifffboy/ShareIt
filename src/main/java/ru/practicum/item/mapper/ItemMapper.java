package ru.practicum.item.mapper;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import ru.practicum.item.dto.CreateItemRequest;
import ru.practicum.item.dto.ItemDto;
import ru.practicum.item.dto.UpdateItemRequest;
import ru.practicum.item.model.Item;
import ru.practicum.user.model.User;

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

    public static Item mapToItem(CreateItemRequest createItemRequest, User owner) {
        Item item = new Item();
        item.setName(createItemRequest.getName());
        item.setDescription(createItemRequest.getDescription());
        item.setOwner(owner);
        item.setAvailable(true);
        item.setCountOfRent(0L);
        return item;
    }

    public static Item mapToItem(Item existingItem, UpdateItemRequest updateItemRequest) {
        existingItem.setId(updateItemRequest.getId());
        existingItem.setName(updateItemRequest.getName());
        existingItem.setDescription(updateItemRequest.getDescription());
        existingItem.setAvailable(updateItemRequest.getIsAvailable());
        if (updateItemRequest.getReview() != null) existingItem.getReviews().add(updateItemRequest.getReview());
        return existingItem;
    }
}