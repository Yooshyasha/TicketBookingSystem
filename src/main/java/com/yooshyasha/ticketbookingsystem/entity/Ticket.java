package com.yooshyasha.ticketbookingsystem.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String sector;
    private int rowNumber;
    private int seatNumber;

    // В ТЗ у модели должен быть datetime, но он бы совпадал с event.datetime, поэтому я не стал его здесь добавлять

    @OneToOne(targetEntity = Event.class, fetch = FetchType.EAGER)
    private Event event;
}
