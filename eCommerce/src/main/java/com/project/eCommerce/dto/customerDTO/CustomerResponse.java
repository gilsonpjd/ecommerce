package com.project.eCommerce.dto.customerDTO;

import com.project.eCommerce.domain.customer.Customer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@Component
public class CustomerResponse {
    private UUID idCustomerDTO;
    private String userNameDTO;

    public CustomerResponse(Customer customer) {

    }
}
