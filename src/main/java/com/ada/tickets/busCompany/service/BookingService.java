package com.ada.tickets.busCompany.service;

import com.ada.tickets.busCompany.models.Booking;
import com.ada.tickets.busCompany.repository.BookingRepositoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {

    @Autowired
    private BookingRepositoryDAO bookingRepositoryDAO;

    public List<Booking> getAll() {
        return bookingRepositoryDAO.getAll();
    }

    public Optional<Booking> getBooking(Integer codBooking) {
        return bookingRepositoryDAO.getBooking(codBooking);
    }

    public Booking saveBooking(Booking booking) {
        return bookingRepositoryDAO.saveBooking(booking);
    }

    public Booking updateBooking(Booking booking) {
        return bookingRepositoryDAO.updateBooking(booking);
    }

    public boolean deleteBooking(Integer codBooking) {
        if(getBooking(codBooking).isPresent()){
            bookingRepositoryDAO.deleteBooking(codBooking);
            return true;
        }else {
            return false;
        }
    }

}
