package ru.practicum.request.mapper;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import ru.practicum.request.dto.CreateRequest;
import ru.practicum.request.dto.RequestDto;
import ru.practicum.request.dto.UpdateRequest;
import ru.practicum.request.model.ItemRequest;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RequestMapper {

    public static RequestDto mapToRequestDto(ItemRequest itemRequest) {
        RequestDto requestDto = new RequestDto();
        requestDto.setId(itemRequest.getId());
        requestDto.setRequest(itemRequest.getRequest());
        requestDto.setRequestUser(itemRequest.getRequestUser());
        return requestDto;
    }

    public static ItemRequest mapToItemRequest(CreateRequest createRequest) {
        ItemRequest itemRequest = new ItemRequest();
        itemRequest.setRequest(createRequest.getRequest());
        itemRequest.setRequestUser(createRequest.getRequestUser());
        return itemRequest;
    }

    public static ItemRequest mapToItemRequest(UpdateRequest updateRequest) {
        ItemRequest itemRequest = new ItemRequest();
        itemRequest.setId(updateRequest.getId());
        itemRequest.setRequest(updateRequest.getRequest());
        itemRequest.setRequestUser(updateRequest.getRequestUser());
        return itemRequest;
    }
}