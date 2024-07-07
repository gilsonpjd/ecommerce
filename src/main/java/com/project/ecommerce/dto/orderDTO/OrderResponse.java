package com.project.ecommerce.dto.orderDTO;

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
public class OrderResponse {

    @NotBlank(message = "The status field cannot be empty.")
    private String statusDTO;

    @NotBlank(message = "The valueOrderDTO field cannot be empty.")
    @Size(min = 3, max = 9)
    private double valueOrderDTO;
}
