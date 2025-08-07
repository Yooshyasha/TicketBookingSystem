package com.yooshyasha.ticketbookingsystem.services;

import com.yooshyasha.ticketbookingsystem.dto.contoller.user.ResponseCreateUser;
import com.yooshyasha.ticketbookingsystem.entity.User;
import com.yooshyasha.ticketbookingsystem.repo.UserRepository;
import jakarta.annotation.Nullable;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private UserRepository userRepository;

    @Nullable
    public User getUser(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public ResponseCreateUser createUser(String fullName, String phoneNumber) {
        User user = User.builder()
                .fullName(fullName)
                .phoneNumber(phoneNumber)
                .build();

        User savedUser = userRepository.save(user);

        return ResponseCreateUser.builder()
                .user(savedUser)
                .build();
    }
}
