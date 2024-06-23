package com.project.eCommerce.repositories;

import com.project.eCommerce.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.UUID;

public interface StockRepositories extends JpaRepository<Product, UUID> {
}
