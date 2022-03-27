package com.ada.tickets.busCompany.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_tbl_booking")
    @SequenceGenerator(name = "seq_tbl_booking", sequenceName = "seq_tbl_booking")
    @Column(name = "cod_booking")
    private Integer codBooking;

    private String name;
    private String email;
    private String origin;
    private String destination;

    @Column(name = "dep_date_time")
    private LocalDateTime departureDateTime;
    private Integer duration;

    public Integer getCodBooking() {
        return codBooking;
    }

    public void setCodBooking(Integer codBooking) {
        this.codBooking = codBooking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDateTime getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(LocalDateTime departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
}
