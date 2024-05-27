package com.demo.basicspringwebapp.flightmanagement.user.Controllers;


import com.demo.basicspringwebapp.flightmanagement.user.DTO.AddUserRequestDTO;
import com.demo.basicspringwebapp.flightmanagement.user.DTO.AddUserResponseDTO;
import com.demo.basicspringwebapp.flightmanagement.user.DTO.UserInfoDTO;
import com.demo.basicspringwebapp.flightmanagement.user.Services.UserManagementService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;


@AllArgsConstructor
@RestController
public class UserController {

    private final UserManagementService userManagementService;

    @PostMapping("/user")
    public AddUserResponseDTO addUser(final AddUserRequestDTO addUserRequestDTO) {
        return this.userManagementService.addUser(addUserRequestDTO);
    }

    @GetMapping("/user/{userId}")
    public UserInfoDTO getUser(@PathVariable("userId") final String userId ) {
        return UserInfoDTO.builder()
          .name("Hello")
          .build();
    }
    
    
}
