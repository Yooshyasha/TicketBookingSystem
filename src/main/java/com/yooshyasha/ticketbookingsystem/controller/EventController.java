package com.yooshyasha.ticketbookingsystem.controller;

import com.yooshyasha.ticketbookingsystem.dto.contoller.event.ResponseGetEvents;
import com.yooshyasha.ticketbookingsystem.services.EventService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/events")
@AllArgsConstructor
public class EventController {
    private EventService eventService;

    @GetMapping("/")
    private ResponseEntity<ResponseGetEvents> getEvents() {
        return ResponseEntity.ok(eventService.getEvents());
    }
}
