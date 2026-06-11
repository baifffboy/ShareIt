package ru.practicum.booking.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Booking {
    private Long id;
    private LocalDateTime from;
    private LocalDateTime to;
    private boolean isApproval;
    // класс бронирования- id, время от и до, бронирование подтверждено владельцем (isApproval)?
}
