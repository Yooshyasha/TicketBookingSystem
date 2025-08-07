package com.yooshyasha.ticketbookingsystem.exception;

public class EventNotFound extends RuntimeException {
    public EventNotFound() {
        super("Event not found");
    }
}
