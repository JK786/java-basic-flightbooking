package com.demo.basicspringwebapp.flightmanagement.user.DTO;

import com.demo.basicspringwebapp.flightmanagement.common.AbstractResponse;
import lombok.*;
import lombok.experimental.SuperBuilder;


@Getter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
public class AddUserResponseDTO extends AbstractResponse {

    private AddUserResponseDTO.User user;

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @SuperBuilder(toBuilder = true)
    public static class User {
        private String id;
        private String name;
        private String emailId;
    }
}
