package com.project.eCommerce.dto.orderDTO;

import com.project.eCommerce.dto.productDTO.ProductResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProductOrderResponse {

    private UUID idProductOrderDTO;
    private ProductResponse productResponse;
    private int quantityDTO;
    private double valueOrderProductDTO;

}
