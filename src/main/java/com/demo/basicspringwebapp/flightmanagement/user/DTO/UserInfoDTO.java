
package com.demo.basicspringwebapp.flightmanagement.user.DTO;

import java.util.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
public class UserInfoDTO {
    
    private String name;

    private Integer age;

    private String dateOfBirth;
}