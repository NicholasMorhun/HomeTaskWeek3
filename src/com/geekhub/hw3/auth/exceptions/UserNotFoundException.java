package com.geekhub.hw3.auth.exceptions;

public class UserNotFoundException extends AuthException {
    public UserNotFoundException() {}

    public UserNotFoundException(String message) {
        super(message);
    }
}
