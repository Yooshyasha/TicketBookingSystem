package com.yooshyasha.ticketbookingsystem.dto.contoller;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseError {
    String message;
}
