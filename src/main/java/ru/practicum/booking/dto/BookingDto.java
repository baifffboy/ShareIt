package ru.practicum.booking.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BookingDto {
    private Long id;
    private LocalDateTime from;
    private LocalDateTime to;
    private boolean isApproval;
}
