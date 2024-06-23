package com.project.eCommerce.repositories;

import com.project.eCommerce.domain.order.ProductOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductOrderRepositories extends JpaRepository<ProductOrder, UUID> {
}
