package com.stackroute.service;

import com.stackroute.repository.UserRepository;
import com.stackroute.domain.UserCredentials;
import com.stackroute.exception.UserNotFoundException;
import com.stackroute.exception.WrongPasswordException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserServiceImpl implements UserServiceInterface {
    private UserRepository userRepository;
    @Autowired
    public UserServiceImpl(UserRepository userRepository) {

        this.userRepository = userRepository;
    }
    @Override
    public UserCredentials checkUserName(UserCredentials user) throws UserNotFoundException,WrongPasswordException {

            Optional<UserCredentials> savedUser=userRepository.findById(user.getEmail());
            if(!userRepository.existsById(user.getEmail())){
                throw new UserNotFoundException("User doesnot exists");
            }
            if(!(user.getPassword().equals(savedUser.get().getPassword()))){
                throw new WrongPasswordException("Wrong Password");
            }
            return user;
    }

}
