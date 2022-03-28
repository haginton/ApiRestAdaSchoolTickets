package com.ada.tickets.busCompany.repository;

import com.ada.tickets.busCompany.models.Booking;

import java.util.List;
import java.util.Optional;

public interface BookingRepositoryDAO {
    List<Booking> getAll();
    Optional<Booking> getBooking (Integer codBooking);
    Booking saveBooking (Booking booking);
    Booking updateBooking (Booking booking);
    void deleteBooking (Integer codBooking);
}
