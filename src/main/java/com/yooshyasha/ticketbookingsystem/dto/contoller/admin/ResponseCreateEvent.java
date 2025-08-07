package com.yooshyasha.ticketbookingsystem.dto.contoller.admin;

import com.yooshyasha.ticketbookingsystem.entity.Event;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseCreateEvent {
    Event event;
}
