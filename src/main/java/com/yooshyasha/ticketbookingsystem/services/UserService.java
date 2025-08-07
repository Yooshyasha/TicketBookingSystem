package com.yooshyasha.ticketbookingsystem.services;

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
    User getUser(Long id) {
        return userRepository.findById(id).orElse(null);
    }
}
