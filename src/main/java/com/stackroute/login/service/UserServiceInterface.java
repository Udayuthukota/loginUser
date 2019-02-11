package com.stackroute.login.service;


import com.stackroute.login.domain.UserCredentials;
import com.stackroute.login.exception.UserNotFoundException;
import com.stackroute.login.exception.WrongPasswordException;

public interface UserServiceInterface {
    public UserCredentials checkUserName(UserCredentials user) throws UserNotFoundException,WrongPasswordException;

}

