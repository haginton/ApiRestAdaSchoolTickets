package com.ada.tickets.busCompany.controller;

import com.ada.tickets.busCompany.models.Booking;
import com.ada.tickets.busCompany.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/booking")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @GetMapping("/allBooking")
    public ResponseEntity<List<Booking>> getAll() {
        return new ResponseEntity<>(bookingService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{idBooking}")
    public ResponseEntity<Booking> getBooking(@PathVariable("idBooking") Integer codBooking) {
        return bookingService.getBooking(codBooking)
                .map(booking -> new ResponseEntity<>(booking, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/saveBooking")
    public ResponseEntity<Booking> saveBooking(@RequestBody Booking booking) {
        if (booking.getOrigin().isEmpty() || booking.getDestination().isEmpty()){
            return new ResponseEntity("Origin and Destination are obligatory", HttpStatus.CONFLICT);
        }
        return new ResponseEntity<>(bookingService.saveBooking(booking), HttpStatus.CREATED);
    }

    @PutMapping("/updateBooking/{idBooking}")
    public ResponseEntity<Booking> updateBooking(@PathVariable("idBooking") Integer codBooking, @RequestBody Booking booking) {
        if (codBooking == null || codBooking <= 0){
            return new ResponseEntity("The Code Booking is required in the url like a path variable or must to be mayor than zero", HttpStatus.CONFLICT);
        }

        Optional<Booking> bookingCaptured = bookingService.getBooking(codBooking);

        if (!bookingCaptured.isPresent()){
            return new ResponseEntity("The Code Booking " + codBooking + " don't exist", HttpStatus.NOT_FOUND);
        }

        booking.setCodBooking(codBooking);

        return new ResponseEntity<>(bookingService.updateBooking(booking), HttpStatus.OK);

    }

    @DeleteMapping("/deleteBooking/{idBooking}")
    public ResponseEntity deleteBooking(@PathVariable("idBooking") Integer codBooking) {
        if (bookingService.deleteBooking(codBooking)){
            return new ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
}
