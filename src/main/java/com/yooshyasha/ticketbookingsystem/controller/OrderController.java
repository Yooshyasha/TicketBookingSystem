package com.yooshyasha.ticketbookingsystem.controller;

import com.yooshyasha.ticketbookingsystem.dto.contoller.order.RequestCreateOrder;
import com.yooshyasha.ticketbookingsystem.dto.contoller.order.ResponseCreateOrder;
import com.yooshyasha.ticketbookingsystem.dto.contoller.order.ResponseGetUserOrder;
import com.yooshyasha.ticketbookingsystem.services.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
@AllArgsConstructor
public class OrderController {
    private OrderService orderService;

    @PostMapping("/create")
    ResponseEntity<ResponseCreateOrder> createOrder(@RequestBody RequestCreateOrder createData) {
        return ResponseEntity.ok(orderService.createOrder(createData.getEvents(), createData.getUserId()));
    }

    @GetMapping("/{userId}/order")
    ResponseEntity<ResponseGetUserOrder> getUserOrder(@PathVariable String userId) {
        return ResponseEntity.ok(orderService.getUserOrder(Long.valueOf(userId)));
    }
}
