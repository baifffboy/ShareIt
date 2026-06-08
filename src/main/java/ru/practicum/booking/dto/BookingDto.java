package ru.practicum.booking.dto;

import java.time.LocalDateTime;

public class BookingDto {
    private Long id;
    private LocalDateTime from;
    private LocalDateTime to;
    private boolean isApproval;
}
