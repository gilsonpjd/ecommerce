package com.project.eCommerce.service;

import com.project.eCommerce.dto.customerDTO.CustomerConvert;
import com.project.eCommerce.dto.customerDTO.CustomerRequest;
import com.project.eCommerce.dto.customerDTO.CustomerResponse;
import com.project.eCommerce.repositories.CustomerRepositories;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepositories customerRepositories;
    private CustomerConvert customerConvert;

    public CustomerService(CustomerRepositories customerRepositories, CustomerConvert customerConvert) {
        this.customerRepositories = customerRepositories;
        this.customerConvert = customerConvert;
    }

    public CustomerResponse createCustomer(CustomerRequest customerRequest) {
        return customerConvert.toResponse(customerRepositories.save(customerConvert.toDomain(customerRequest)));
    }
}

