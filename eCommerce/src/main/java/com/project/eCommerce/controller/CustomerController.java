package com.project.eCommerce.controller;

import com.project.eCommerce.dto.customerDTO.CustomerConvert;
import com.project.eCommerce.dto.customerDTO.CustomerRequest;
import com.project.eCommerce.dto.customerDTO.CustomerResponse;
import com.project.eCommerce.service.CustomerService;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        return ResponseEntity.status(HttpStatus.CREATED).body(customerService.createCustomer(customerRequest));
    }

}
