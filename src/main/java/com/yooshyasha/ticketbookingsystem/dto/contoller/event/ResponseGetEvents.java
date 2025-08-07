package com.yooshyasha.ticketbookingsystem.dto.contoller.event;

import com.yooshyasha.ticketbookingsystem.entity.Event;
import lombok.Builder;
import lombok.Data;

import java.util.Collection;

@Data
@Builder
public class ResponseGetEvents {
    private Collection<Event> events;
}
