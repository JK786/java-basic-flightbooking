package com.demo.basicspringwebapp.flightmanagement.user.DTO;

import com.demo.basicspringwebapp.flightmanagement.common.AbstractResponse;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Builder(toBuilder = true)
public class AddUserResponseDTO extends AbstractResponse {

    private AddUserResponseDTO.User user;

    @Getter
    @Builder(toBuilder = true)
    public static class User {
        private String id;
        private String name;
        private String emailId;
    }
}
