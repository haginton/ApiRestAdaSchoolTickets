package com.ada.tickets.busCompany.repository;

import com.ada.tickets.busCompany.models.Booking;
import org.springframework.data.repository.CrudRepository;

public interface BookingCrudRepository extends CrudRepository<Booking, Integer> {

}
