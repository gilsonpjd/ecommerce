package com.project.eCommerce.dto.orderDTO;

import com.project.eCommerce.dto.productDTO.ProductResponse;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class ProductOrderResponse {

    @NotBlank(message = "The nameProduct field cannot be empty.")
    @Size(min = 3, max = 10)
    private String nameProduct;

    @NotBlank(message = "The quantity field cannot be empty.")
    @Size(min = 1, max = 3)
    private int quantityDTO;

    @NotBlank(message = "The valueOrderProduct field cannot be empty.")
    @Size(min = 3, max = 9)
    private double valueOrderProductDTO;

}
