package com.project.ecommerce.dto.productDTO;

import com.project.ecommerce.domain.product.Product;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class ProductResponse {

    @NotBlank(message = "The nameProduct field cannot be empty.")
    @Size(min = 3, max = 50)
    private String nameProduct;

    @NotBlank(message = "The brand field cannot be empty.")
    @Size(min = 1, max = 20)
    private String brand;

    @NotBlank(message = "The type field cannot be empty.")
    @Size(min = 1, max = 20)
    private String type;

    @NotBlank(message = "The value field cannot be empty.")
    @Size(min = 3, max = 9)
    private double value;

    public ProductResponse(Product product) {

    }
}
