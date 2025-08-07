package com.yooshyasha.ticketbookingsystem.exception;

public class UserNotFound extends RuntimeException {
    public UserNotFound() {
        super("User not found");
    }
}
