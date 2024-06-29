package com.project.eCommerce.dto.productDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class ProductRequest {

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

}
