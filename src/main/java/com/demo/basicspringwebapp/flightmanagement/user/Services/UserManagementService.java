package com.demo.basicspringwebapp.flightmanagement.user.Services;

import com.demo.basicspringwebapp.flightmanagement.user.DTO.AddUserRequestDTO;
import com.demo.basicspringwebapp.flightmanagement.user.DTO.AddUserResponseDTO;
import com.demo.basicspringwebapp.flightmanagement.user.UserDAO;
import com.demo.basicspringwebapp.flightmanagement.user.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Log4j2
@AllArgsConstructor
@Service
public class UserManagementService {

    private final UserRepository userRepository;
    public AddUserResponseDTO addUser(final AddUserRequestDTO addUserRequestDTO) {

        final Optional<UserDAO> user = this.userRepository.findByEmailId(addUserRequestDTO.getEmailId());

        if(user.isPresent()) {

            //TODO add appropriate response code

            AddUserResponseDTO.builder()
                    .user(AddUserResponseDTO.User.builder()
                            .id(user.get().getId())
                            .name(user.get().getName())
                            .emailId(user.get().getEmailId())
                            .build())
                    .build();

        } else {

            //TODO add appropriate response code

            final UserDAO userDAO = UserDAO.builder()
                    .name(addUserRequestDTO.getName())
                    .emailId(addUserRequestDTO.getEmailId())
                    .build();
            final UserDAO savedUser = this.userRepository.save(userDAO);
            return AddUserResponseDTO.builder()
                    .user(AddUserResponseDTO.User.builder()
                            .id(savedUser.getId())
                            .name(savedUser.getName())
                            .emailId(savedUser.getEmailId())
                            .build())
                    .build();

        }

        return null;
    }

}
