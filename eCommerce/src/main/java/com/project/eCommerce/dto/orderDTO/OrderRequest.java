package com.project.eCommerce.dto.orderDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequest {

    private UUID idOrderDTO;
    private Date dateDTO;
    private String statusDTO;
    private double valueOrderDTO;
    private UUID customerIdDTO;
    private UUID productOrderIdDTO;


}
