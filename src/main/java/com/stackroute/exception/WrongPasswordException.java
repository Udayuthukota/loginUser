package com.stackroute.exception;

public class WrongPasswordException extends Exception {
    private String message;
    public WrongPasswordException(String message){
        super(message);
        this.message=message;
    }
}
