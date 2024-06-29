package com.project.eCommerce.service;

import com.project.eCommerce.dto.customerDTO.CustomerConvert;
import com.project.eCommerce.dto.customerDTO.CustomerRequest;
import com.project.eCommerce.dto.customerDTO.CustomerResponse;
import com.project.eCommerce.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepositories;
    private CustomerConvert customerConvert;

    public CustomerService(CustomerRepository customerRepositories, CustomerConvert customerConvert) {
        this.customerRepositories = customerRepositories;
        this.customerConvert = customerConvert;
    }

    public CustomerResponse createCustomer(CustomerRequest customerRequest) {
        return customerConvert.toResponse(customerRepositories.save(customerConvert.toDomain(customerRequest)));
    }
}

