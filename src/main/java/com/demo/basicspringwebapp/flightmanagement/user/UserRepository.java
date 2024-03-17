package com.demo.basicspringwebapp.flightmanagement.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserDAO, String> {

    public Optional<UserDAO> findByEmailId(String emailId);

}
