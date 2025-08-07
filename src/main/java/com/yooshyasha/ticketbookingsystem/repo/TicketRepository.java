package com.yooshyasha.ticketbookingsystem.repo;

import com.yooshyasha.ticketbookingsystem.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
