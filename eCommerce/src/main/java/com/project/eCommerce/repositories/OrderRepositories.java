package com.project.eCommerce.repositories;

import com.project.eCommerce.domain.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderRepositories extends JpaRepository<Order, UUID> {
}
