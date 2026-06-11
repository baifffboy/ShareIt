package ru.practicum.booking.mapper;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import ru.practicum.booking.dto.BookingDto;
import ru.practicum.booking.dto.CreateBookingRequest;
import ru.practicum.booking.dto.UpdateBookingRequest;
import ru.practicum.booking.model.Booking;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class BookingMapper {
    public static BookingDto mapToBookingDto(Booking booking) {
        BookingDto bookingDto = new BookingDto();
        bookingDto.setId(booking.getId());
        bookingDto.setApproval(booking.isApproval());
        bookingDto.setTo(booking.getTo());
        bookingDto.setFrom(booking.getFrom());
        return bookingDto;
    }

    public static Booking mapToBooking(CreateBookingRequest bookingRequest) {
        Booking booking = new Booking();
        booking.setFrom(bookingRequest.getFrom());
        booking.setTo(bookingRequest.getTo());
        booking.setApproval(booking.isApproval());
        return booking;
    }

    public static Booking mapToBooking(UpdateBookingRequest bookingRequest) {
        Booking booking = new Booking();
        booking.setId(bookingRequest.getId());
        booking.setFrom(bookingRequest.getFrom());
        booking.setTo(bookingRequest.getTo());
        booking.setApproval(booking.isApproval());
        return booking;
    }
}
