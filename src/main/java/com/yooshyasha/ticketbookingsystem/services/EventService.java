package com.yooshyasha.ticketbookingsystem.services;

import com.yooshyasha.ticketbookingsystem.dto.contoller.event.ResponseGetEvents;
import com.yooshyasha.ticketbookingsystem.entity.Event;
import com.yooshyasha.ticketbookingsystem.repo.EventRepository;
import jakarta.annotation.Nullable;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EventService {
    private EventRepository eventRepository;

    public ResponseGetEvents getEvents() {
        return ResponseGetEvents.builder()
                .events(eventRepository.findAll())
                .build();
    }

    @Nullable
    public Event getEvent(Long id) {
        return eventRepository.findById(id).orElse(null);
    }
}
