package com.yooshyasha.ticketbookingsystem.dto.contoller.admin;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RequestCreateEvent {
    String name;
    String place;
    int totalTickets;
    int availableTickets;
    int price;
    LocalDateTime datetime;
}
