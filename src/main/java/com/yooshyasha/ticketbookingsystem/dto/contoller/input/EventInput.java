package com.yooshyasha.ticketbookingsystem.dto.contoller.input;

import lombok.Data;

@Data
public class EventInput {
    private Long id;
    private int rowNumber;
    private int seatNumber;
    private String sector;
}
