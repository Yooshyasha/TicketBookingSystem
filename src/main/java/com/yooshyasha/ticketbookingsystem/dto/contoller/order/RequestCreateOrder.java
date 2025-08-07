package com.yooshyasha.ticketbookingsystem.dto.contoller.order;

import com.yooshyasha.ticketbookingsystem.dto.contoller.input.EventInput;
import lombok.Data;

import java.util.Collection;

@Data
public class RequestCreateOrder {
    private Collection<EventInput> events;
    private Long userId;
}
