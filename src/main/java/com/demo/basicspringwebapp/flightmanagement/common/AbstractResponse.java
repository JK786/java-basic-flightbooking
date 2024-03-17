package com.demo.basicspringwebapp.flightmanagement.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@SuperBuilder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public abstract class AbstractResponse {

    private String statusCode;

    private String message;

}
