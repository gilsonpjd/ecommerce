package com.project.eCommerce.dto.customerDTO;

import com.project.eCommerce.domain.customer.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerConvert {


    public Customer toDomain (CustomerRequest customerRequest){
        return new Customer(customerRequest);
    }

    public CustomerResponse toResponse(Customer customer) {
        return new CustomerResponse(customer);
    }


}
