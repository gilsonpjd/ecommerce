package com.project.eCommerce.dto.customerDTO;

import com.project.eCommerce.domain.order.Order;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRequest {
    private UUID idCustomerDTO;
    private String userNameDTO;

}

