package com.stackroute.controller;

import com.stackroute.domain.UserCredentials;
import com.stackroute.exception.UserNotFoundException;
import com.stackroute.exception.WrongPasswordException;
import com.stackroute.service.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="api/v1")
public class UserController {

    private UserServiceInterface userService;
@Autowired
    public UserController(UserServiceInterface userService) {
        this.userService = userService;
    }
    @PostMapping("/login")
    public ResponseEntity<String> authenticateUser(@RequestBody UserCredentials user) throws UserNotFoundException, WrongPasswordException {

    ResponseEntity<String> responseEntity;
    try {

        userService.checkUserName(user);
        responseEntity = new ResponseEntity<String>("Successfully Logged In", HttpStatus.OK);
    }
    catch (Exception e){
        responseEntity=new ResponseEntity<>("loser", HttpStatus.BAD_GATEWAY);
     e.printStackTrace();
    }
    return responseEntity;
    }


}
