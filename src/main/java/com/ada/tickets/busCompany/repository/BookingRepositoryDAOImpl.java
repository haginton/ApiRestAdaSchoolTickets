package com.ada.tickets.busCompany.repository;

import com.ada.tickets.busCompany.models.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class BookingRepositoryDAOImpl implements BookingRepositoryDAO{

    @Autowired
    private BookingCrudRepository bookingCrudRepository;

    @Override
    public List<Booking> getAll() {
        return (List<Booking>) bookingCrudRepository.findAll();
    }

    @Override
    public Optional<Booking> getBooking(Integer codBooking) {
        return bookingCrudRepository.findById(codBooking);
    }

    @Override
    public Booking saveBooking(Booking booking) {
        return bookingCrudRepository.save(booking);
    }

    @Override
    public Booking updateBooking(Booking booking) {
        return bookingCrudRepository.save(booking);
    }

    @Override
    public void deleteBooking(Integer codBooking) {
        bookingCrudRepository.deleteById(codBooking);
    }
}
