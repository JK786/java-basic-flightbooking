package com.demo.basicspringwebapp.flightmanagement.user;

import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;

@Getter
@Table(name = "user")
@Builder(toBuilder = true)
public class UserDAO {

    private String id;

    private String name;

    private String emailId;
}
