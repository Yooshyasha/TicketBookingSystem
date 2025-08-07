package com.yooshyasha.ticketbookingsystem.exception;

public class UserAlreadyHasOrder extends RuntimeException {
    public UserAlreadyHasOrder() {
        super("User already has order");
    }
}
