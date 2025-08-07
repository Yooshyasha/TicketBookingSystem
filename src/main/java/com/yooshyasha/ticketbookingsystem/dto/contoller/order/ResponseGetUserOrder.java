package com.yooshyasha.ticketbookingsystem.dto.contoller.order;

import com.yooshyasha.ticketbookingsystem.entity.Order;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseGetUserOrder {
    private Order order;
}
