package com.project.eCommerce.repositories;

import com.project.eCommerce.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductRepositories extends JpaRepository<Product, UUID> {
}
