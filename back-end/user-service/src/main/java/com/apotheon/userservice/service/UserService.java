package com.apotheon.userservice.service;

import com.apotheon.userservice.entity.User;
import com.apotheon.userservice.repository.RoleRepository;
import com.apotheon.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    public User createUser(User userDetails) {
        return userDetails;
    }


}