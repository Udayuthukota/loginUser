package com.stackroute.login.controller;

import com.stackroute.login.domain.UserCredentials;
import com.stackroute.login.exception.UserNotFoundException;
import com.stackroute.login.exception.WrongPasswordException;
import com.stackroute.login.service.UserServiceInterface;
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
