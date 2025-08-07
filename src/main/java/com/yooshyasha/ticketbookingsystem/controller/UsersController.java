package com.yooshyasha.ticketbookingsystem.controller;

import com.yooshyasha.ticketbookingsystem.dto.contoller.user.RequestCreateUser;
import com.yooshyasha.ticketbookingsystem.dto.contoller.user.ResponseCreateUser;
import com.yooshyasha.ticketbookingsystem.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UsersController {
    private UserService userService;

    @PostMapping("/create")
    ResponseEntity<ResponseCreateUser> createUser(@RequestBody RequestCreateUser createData) {
        return ResponseEntity.ok(userService.createUser(createData.getFullName(), createData.getPhoneNumber()));
    }
}
