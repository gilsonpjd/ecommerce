package com.project.eCommerce.repositories;

import com.project.eCommerce.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepositories extends JpaRepository<Product, UUID> {
}
