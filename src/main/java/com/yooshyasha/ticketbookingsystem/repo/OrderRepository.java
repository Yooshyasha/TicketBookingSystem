package com.yooshyasha.ticketbookingsystem.repo;

import com.yooshyasha.ticketbookingsystem.entity.Order;
import jakarta.annotation.Nullable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    @Nullable
    Order findByUserId(Long userId);
}
