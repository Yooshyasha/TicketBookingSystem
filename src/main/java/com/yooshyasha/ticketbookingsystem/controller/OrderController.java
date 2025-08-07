package com.yooshyasha.ticketbookingsystem.controller;

import com.yooshyasha.ticketbookingsystem.dto.contoller.order.RequestCreateOrder;
import com.yooshyasha.ticketbookingsystem.dto.contoller.order.ResponseCreateOrder;
import com.yooshyasha.ticketbookingsystem.services.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order")
@AllArgsConstructor
public class OrderController {
    private OrderService orderService;

    @PostMapping("/create")
    ResponseEntity<ResponseCreateOrder> createOrder(@RequestBody RequestCreateOrder createData) {
        return ResponseEntity.ok(orderService.createOrder(createData.getEvents(), createData.getUserId()));
    }
}
