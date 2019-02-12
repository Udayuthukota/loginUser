package com.stackroute.service;


import com.stackroute.domain.UserCredentials;
import com.stackroute.exception.UserNotFoundException;
import com.stackroute.exception.WrongPasswordException;

public interface UserServiceInterface {
    public UserCredentials checkUserName(UserCredentials user) throws UserNotFoundException,WrongPasswordException;

}

