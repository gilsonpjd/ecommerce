package com.project.eCommerce.service;

import com.project.eCommerce.domain.customer.Customer;
import com.project.eCommerce.dto.customerDTO.CustomerConvert;
import com.project.eCommerce.dto.customerDTO.CustomerRequest;
import com.project.eCommerce.dto.customerDTO.CustomerResponse;
import com.project.eCommerce.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Objects.nonNull;

@Service
public class CustomerService {

    private final CustomerRepository customerRepositories;
    private final CustomerConvert customerConvert;

    public CustomerService(CustomerRepository customerRepositories, CustomerConvert customerConvert) {
        this.customerRepositories = customerRepositories;
        this.customerConvert = customerConvert;
    }

    public CustomerResponse createCustomer(CustomerRequest customerRequest) {
        return customerConvert.toResponse(this.customerRepositories.save(customerConvert.CustomerRequestToDomain(customerRequest)));
    }

    public CustomerResponse findByName(String name) {
        return customerConvert.toResponse(this.customerRepositories.findByName(name));
    }


    public CustomerResponse findByCPF(String cpf) {
        return customerConvert.toResponse(this.customerRepositories.findByCpf(cpf));
    }

    public List<CustomerResponse> findAllCustomers() {
        List<Customer> allCustomers = customerRepositories.findAll();
        return allCustomers.stream()
                .map(customerConvert::toResponse).
                collect(Collectors.toList());
    }

    public CustomerResponse updateCustomer(String cpf, CustomerRequest customerRequest) {
        Customer customer = new Customer(findByCPF(cpf));
        customer.setName(customerRequest.getName());
        customer.setEmail(customerRequest.getEmail());
        customer.setDateOfBirth(customerRequest.getDateOfBirth());
        customer.setAdress(customer.getAdress().getStreet(),
                customerRequest.getAdress().getCity(),
                customerRequest.getAdress().getCountry());
        this.customerRepositories.save(customer);
        return customerConvert.toResponse(customer);
    }

    public CustomerResponse partiallyUpdateCustomer(String cpf, CustomerRequest customerRequest) {
        Customer customer = new Customer(findByCPF(cpf));
        customer.setName(nonNull(customerRequest.getName()) ? customerRequest.getName() : customer.getName());
        customer.setEmail(nonNull(customerRequest.getEmail()) ? customerRequest.getEmail() : customer.getEmail());
        customer.setDateOfBirth(nonNull(customerRequest.getDateOfBirth()) ? customerRequest.getDateOfBirth() : customer.getDateOfBirth());
        if (customerRequest.getAdress().getStreet() == null
                || customerRequest.getAdress().getCity() == null
                || customerRequest.getAdress().getCountry() == null) {
            customer.setAdress(customer.getAdress().getStreet(),
                    customer.getAdress().getCity(),
                    customer.getAdress().getCountry());

        } else {
            customer.setAdress(customerRequest.getAdress().getStreet(),
                    customerRequest.getAdress().getCity(),
                    customerRequest.getAdress().getCountry());

        }
        this.customerRepositories.save(customer);
        return customerConvert.toResponse(customer);
    }

    public void deleteCustomer(String name) {
        this.customerRepositories.delete(new Customer(findByName(name)));
    }

}
