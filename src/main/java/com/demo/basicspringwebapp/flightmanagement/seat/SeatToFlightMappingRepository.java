package com.demo.basicspringwebapp.flightmanagement.seat;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatToFlightMappingRepository extends JpaRepository<SeatToFlightMappingDAO, String> {

}
