package com.yooshyasha.ticketbookingsystem.services;

import com.yooshyasha.ticketbookingsystem.dto.contoller.input.EventInput;
import com.yooshyasha.ticketbookingsystem.dto.contoller.order.ResponseCreateOrder;
import com.yooshyasha.ticketbookingsystem.dto.contoller.order.ResponseGetUserOrder;
import com.yooshyasha.ticketbookingsystem.entity.Order;
import com.yooshyasha.ticketbookingsystem.entity.Ticket;
import com.yooshyasha.ticketbookingsystem.entity.User;
import com.yooshyasha.ticketbookingsystem.exception.UserNotFound;
import com.yooshyasha.ticketbookingsystem.repo.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class OrderService {
    private UserService userService;
    private TicketService ticketService;
    private OrderRepository orderRepository;

    public ResponseCreateOrder createOrder(Collection<EventInput> orderEvents, Long userId) {
        User user = userService.getUser(userId);

        if (user == null) {
            throw new UserNotFound();
        }

        Collection<Ticket> tickets = ticketService.createTickets(orderEvents);

        Order order = Order.builder()
                .user(user)
                .tickets(tickets)
                .build();

        Order savedOrder = orderRepository.save(order);

        return ResponseCreateOrder.builder()
                .order(savedOrder)
                .build();
    }

    public ResponseGetUserOrder getUserOrder(Long userId) {
        Order order = orderRepository.findByUserId(userId);

        return ResponseGetUserOrder.builder()
                .order(order)
                .build();
    }
}
