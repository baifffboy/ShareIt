package ru.practicum.booking.dto;

import jakarta.validation.constraints.Future;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CreateBookingRequest {
    @Future(message = "Дата момента с которого вы хотите взять вещи должна начинаться в будущем")
    private LocalDateTime from;
    @Future(message = "Дата момента по который вы хотите взять вещи должна начинаться в будущем")
    private LocalDateTime to;
    // при create isApproval всегда true
}
