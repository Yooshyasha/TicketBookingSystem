package com.yooshyasha.ticketbookingsystem.exception;

public class EventNotAvailable extends RuntimeException {
    public EventNotAvailable() {
        super("Event not available");
    }
}
