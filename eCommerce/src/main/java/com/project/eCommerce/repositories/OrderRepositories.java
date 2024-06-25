package com.project.eCommerce.repositories;

import com.project.eCommerce.domain.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OrderRepositories extends JpaRepository<Order, UUID> {
}
