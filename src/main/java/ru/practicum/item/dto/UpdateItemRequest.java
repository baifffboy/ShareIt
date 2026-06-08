package ru.practicum.item.dto;

import jakarta.validation.constraints.Positive;

import java.util.List;

public class UpdateItemRequest {
    @Positive(message = "id не может быть отрицательным или равным 0")
    private Long id;
    private String name;
    private String description;
    private String review;
}