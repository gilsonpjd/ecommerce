package com.project.eCommerce.repositories;

import com.project.eCommerce.domain.order.ProductOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductOrderRepositories extends JpaRepository<ProductOrder, UUID> {
}
