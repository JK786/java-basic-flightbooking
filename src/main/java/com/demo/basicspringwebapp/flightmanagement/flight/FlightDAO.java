package com.demo.basicspringwebapp.flightmanagement.flight;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;


@Table(name = "flight")
@Getter
@Builder(toBuilder = true)
public class FlightDAO {

    @Id
    private String id;

    private String name;

}
