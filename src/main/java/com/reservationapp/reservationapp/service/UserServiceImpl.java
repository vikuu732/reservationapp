package com.reservationapp.reservationapp.service;

import com.reservationapp.reservationapp.entity.UserRegistration;
import com.reservationapp.reservationapp.payload.UserRegistrationDto;
import com.reservationapp.reservationapp.repository.UserRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {
    @Autowired
    private UserRegistrationRepository userRegistrationRepository;

    public UserRegistrationDto createUser(UserRegistration userRegistration){
        userRegistrationRepository.save(userRegistration);
        return null;
    }

    public UserRegistration getUserbyId(long id) {
        return userRegistrationRepository.findById(id).get();
    }
}
