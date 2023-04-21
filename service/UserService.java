package com.ems.service;

import com.ems.entities.User;
import com.ems.payload.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public interface UserService extends UserDetailsService{
    User save(UserRegistrationDto registrationDto);
}
