package com.yooshyasha.ticketbookingsystem.controller;

import com.yooshyasha.ticketbookingsystem.dto.contoller.admin.RequestCreateEvent;
import com.yooshyasha.ticketbookingsystem.dto.contoller.admin.ResponseCreateEvent;
import com.yooshyasha.ticketbookingsystem.services.EventService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
@AllArgsConstructor
public class AdminController {
    private EventService eventService;

    @PostMapping("/event")
    ResponseEntity<ResponseCreateEvent> createEvent(@RequestBody RequestCreateEvent createData) {
        return ResponseEntity.ok(eventService.createEvent(
                createData.getName(),
                createData.getPlace(),
                createData.getTotalTickets(),
                createData.getAvailableTickets(),
                createData.getPrice(),
                createData.getDatetime()
        ));
    }
}
