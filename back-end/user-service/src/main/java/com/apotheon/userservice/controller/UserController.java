package com.apotheon.userservice.controller;

import com.apotheon.userservice.configuration.PropertyConfiguration;
import com.apotheon.userservice.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(PropertyConfiguration.API_USER_URL)
public class UserController {

    @PostMapping(PropertyConfiguration.ACCOUNT_REGISTER_URL)
    public ResponseEntity<?> createAccount(@RequestBody User userDetails) {
        try {
//            if (userDetails != null) {
//                System.out.println();
                return new ResponseEntity<>(userDetails, HttpStatus.OK);
//            } else {
//                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>("An error occurred", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping(PropertyConfiguration.ACCOUNT_LOGIN_URL)
    public ResponseEntity<?> accountLogin(@RequestBody User userDetails) {
        try {
//            if (userDetails != null) {
//                System.out.println();

            return new ResponseEntity<>(userDetails, HttpStatus.OK);
//            } else {
//                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>("An error occurred", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
