package com.demo.basicspringwebapp.flightmanagement.seat;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;

@Table(name = "user")
@Builder(toBuilder = true)
public class SeatToFlightMappingDAO {

    @Id
    private String id;

    private String seatId;

    private String flightId;
}
