package com.yooshyasha.ticketbookingsystem.repo;

import com.yooshyasha.ticketbookingsystem.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
}
