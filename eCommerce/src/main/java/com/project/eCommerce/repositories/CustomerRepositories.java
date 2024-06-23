package com.project.eCommerce.repositories;

import com.project.eCommerce.domain.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface CustomerRepositories extends JpaRepository<Customer, UUID> {

}
