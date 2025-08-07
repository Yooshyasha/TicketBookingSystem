package com.yooshyasha.ticketbookingsystem.services;

import com.yooshyasha.ticketbookingsystem.dto.contoller.input.EventInput;
import com.yooshyasha.ticketbookingsystem.entity.Event;
import com.yooshyasha.ticketbookingsystem.entity.Ticket;
import com.yooshyasha.ticketbookingsystem.exception.EventNotFound;
import com.yooshyasha.ticketbookingsystem.repo.TicketRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
@AllArgsConstructor
public class TicketService {
    private TicketRepository ticketRepository;
    private EventService eventService;

    public Collection<Ticket> createTickets(Collection<EventInput> events) {
        List<Ticket> tickets = new ArrayList<>();

        events.forEach((eventInput -> {
            Event event = eventService.getEvent(eventInput.getId());

            if (event == null) {
                throw new EventNotFound();
            }

            Ticket ticket = Ticket.builder()
                    .sector(eventInput.getSector())
                    .rowNumber(eventInput.getRowNumber())
                    .seatNumber(eventInput.getSeatNumber())
                    .event(eventService.minusTicket(event))
                    .build();

            tickets.add(ticketRepository.save(ticket));
        }));

        return tickets;
    }
}
