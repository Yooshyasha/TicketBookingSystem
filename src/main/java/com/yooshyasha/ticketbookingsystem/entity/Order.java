package com.yooshyasha.ticketbookingsystem.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.Collection;

@Entity
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(targetEntity = User.class, fetch = FetchType.EAGER)
    private User user;

    @OneToMany(targetEntity = Ticket.class, fetch = FetchType.EAGER)
    private Collection<Ticket> tickets;

    @CreationTimestamp
    private LocalDateTime bookingTime;
}
