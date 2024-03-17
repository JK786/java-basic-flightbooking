package com.demo.basicspringwebapp.flightmanagement.common;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class AbstractResponse {

    private String statusCode;

    private String message;

}
