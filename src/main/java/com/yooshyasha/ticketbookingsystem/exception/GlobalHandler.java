package com.yooshyasha.ticketbookingsystem.exception;

import com.yooshyasha.ticketbookingsystem.dto.contoller.ResponseError;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalHandler {
    @ExceptionHandler(EventNotAvailable.class)
    ResponseEntity<ResponseError> handleEventNotAvailable(EventNotAvailable e) {
        return ResponseEntity.status(403).body(ResponseError.builder().message(e.getMessage()).build());
    }

    @ExceptionHandler(EventNotFound.class)
    ResponseEntity<ResponseError> handleEventNotAvailable(EventNotFound e) {
        return ResponseEntity.status(403).body(ResponseError.builder().message(e.getMessage()).build());
    }

    @ExceptionHandler(UserAlreadyHasOrder.class)
    ResponseEntity<ResponseError> handleEventNotAvailable(UserAlreadyHasOrder e) {
        return ResponseEntity.status(403).body(ResponseError.builder().message(e.getMessage()).build());
    }

    @ExceptionHandler(UserNotFound.class)
    ResponseEntity<ResponseError> handleEventNotAvailable(UserNotFound e) {
        return ResponseEntity.status(404).body(ResponseError.builder().message(e.getMessage()).build());
    }
}
