package com.project.ecommerce.controller;

import com.project.ecommerce.dto.customerDTO.CustomerConvert;
import com.project.ecommerce.dto.customerDTO.CustomerRequest;
import com.project.ecommerce.dto.customerDTO.CustomerResponse;
import com.project.ecommerce.exception.CustomerNotFoundException;
import com.project.ecommerce.service.CustomerService;
import io.swagger.annotations.ApiOperation;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService, CustomerConvert customerConvert) {
        this.customerService = customerService;
    }

    @ApiOperation("Creates a Customer")
    @PostMapping
    public ResponseEntity<CustomerResponse> createCustomer(@RequestBody @Valid CustomerRequest customerRequest) {
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(customerService.createCustomer(customerRequest));
        } catch (CustomerNotFoundException ex) {
            throw new CustomerNotFoundException("Unable to create client, review attributes");
        }
    }

    @ApiOperation("Finds all Customers")
    @GetMapping
    public ResponseEntity<List<CustomerResponse>> findAllCustomers() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(customerService.findAllCustomers());
        } catch (CustomerNotFoundException ex) {
            throw new CustomerNotFoundException("There are no registered customers");
        }

    }

    @ApiOperation("Finds by name")
    @GetMapping("/customers/{name}")
    public ResponseEntity<CustomerResponse> findByName(@PathVariable String name) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(customerService.findByName(name));
        } catch (CustomerNotFoundException ex) {
            throw new CustomerNotFoundException("Customer not found: " + name);
        }
    }

    @ApiOperation("Finds by CPF")
    @GetMapping("/customers/{cpf}")
    public ResponseEntity<CustomerResponse> findByCPF(@PathVariable String cpf) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(customerService.findByCPF(cpf));
        } catch (CustomerNotFoundException ex) {
            throw new CustomerNotFoundException("CPF not found");
        }
    }

    @ApiOperation("Updates a Customer")
    @PutMapping("/customers/{cpf}")
    public ResponseEntity<CustomerResponse> updateCustomer(@PathVariable String cpf, @RequestBody @Valid CustomerRequest customerRequest) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(customerService.updateCustomer(cpf, customerRequest));
        } catch (CustomerNotFoundException ex) {
            throw new CustomerNotFoundException("Unable to update customer data.");
        }
    }

    @ApiOperation("Updates partially a Customer")
    @PatchMapping("/customers/{cpf}")
    public ResponseEntity<CustomerResponse> partiallyUpdateCustomer(@PathVariable String cpf, @RequestBody @Valid CustomerRequest customerRequest) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(customerService.partiallyUpdateCustomer(cpf, customerRequest));
        } catch (CustomerNotFoundException ex) {
            throw new CustomerNotFoundException("Unable to update customer data.");
        }
    }


    @ApiOperation("Deletes a Customer")
    @PutMapping("/customers/{name}")
    public ResponseEntity<CustomerResponse> deleteCustomer(@PathVariable String name) {
        try {
            customerService.deleteCustomer(name);
            return ResponseEntity.noContent().build();
        } catch (CustomerNotFoundException ex) {
            throw new CustomerNotFoundException("Customer not found: " + name);
        }
    }


}
