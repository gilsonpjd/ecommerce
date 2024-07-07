package com.project.ecommerce.dto.customerDTO;

import com.project.ecommerce.domain.customer.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerConvert {


    public Customer CustomerRequestToDomain(CustomerRequest customerRequest){
        return new Customer(customerRequest);
    }

    public Customer CustomerResponseToDomain(CustomerResponse customerResponse){
        return new Customer(customerResponse);
    }



    public CustomerResponse toResponse(Customer customer) {
        return new CustomerResponse(customer);
    }


}
