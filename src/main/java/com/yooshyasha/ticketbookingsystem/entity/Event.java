package com.yooshyasha.ticketbookingsystem.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;


@Data
@Entity
@Table(name = "app_event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String place;

    private int totalTickets;
    private int availableTickets;

    private int price;

    private LocalDateTime datetime;
}
