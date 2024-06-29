package com.project.eCommerce.controller;

import com.project.eCommerce.domain.customer.Customer;
import com.project.eCommerce.dto.customerDTO.CustomerConvert;
import com.project.eCommerce.dto.customerDTO.CustomerRequest;
import com.project.eCommerce.dto.customerDTO.CustomerResponse;
import com.project.eCommerce.exception.CustomerNotFoundException;
import com.project.eCommerce.service.CustomerService;
import io.swagger.annotations.ApiOperation;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService, CustomerConvert customerConvert) {
        this.customerService = customerService;
    }

    @ApiOperation("Create an Customer")
    @PostMapping
    public ResponseEntity<CustomerResponse> createCustomer(@RequestBody CustomerRequest customerRequest) {
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(customerService.createCustomer(customerRequest));
        } catch (CustomerNotFoundException ex) {
            throw new CustomerNotFoundException("Unable to create client, review attributes");
        }
    }

    @ApiOperation("Find all customers")
    @GetMapping
    public ResponseEntity<List<CustomerResponse>> findAllCustomers() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(customerService.findAllCustomers());
        } catch (CustomerNotFoundException ex) {
            throw new CustomerNotFoundException("There are no registered customers");
        }

    }

    @ApiOperation("Find by name")
    @GetMapping("/customers/{name}")
    public ResponseEntity<CustomerResponse> findByName(@PathVariable String name) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(customerService.findByName(name));
        } catch (CustomerNotFoundException ex) {
            throw new CustomerNotFoundException("Customer not found: " + name);
        }
    }

    @ApiOperation("Find by cpf")
    @GetMapping("/customers/{cpf}")
    public ResponseEntity<CustomerResponse> findByCPF(@PathVariable String cpf) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(customerService.findByCPF(cpf));
        } catch (CustomerNotFoundException ex) {
            throw new CustomerNotFoundException("CPF not found");
        }
    }

    @ApiOperation("Upadate customer")
    @PutMapping("/customers/{cpf}")
    public ResponseEntity<CustomerResponse> updateCustomer(@PathVariable String cpf, @RequestBody @Valid CustomerRequest customerRequest) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(customerService.updateCustomer(cpf, customerRequest));
        } catch (CustomerNotFoundException ex) {
            throw new CustomerNotFoundException("Unable to update customer data.");
        }
    }

    @ApiOperation("Upadate partially an customer")
    @PatchMapping("/customers/{cpf}")
    public ResponseEntity<CustomerResponse> partiallyUpdateCustomer(@PathVariable String cpf, @RequestBody @Valid CustomerRequest customerRequest) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(customerService.partiallyUpdateCustomer(cpf, customerRequest));
        } catch (CustomerNotFoundException ex) {
            throw new CustomerNotFoundException("Unable to update customer data.");
        }
    }


    @ApiOperation("Delete customer")
    @PutMapping("/customers/{name}")
    public ResponseEntity<CustomerResponse> deleteCustomer(@PathVariable String name) {
        try {
            return ResponseEntity.noContent().build();
        } catch (CustomerNotFoundException ex) {
            throw new CustomerNotFoundException("Customer not found: " + name);
        }
    }


}
