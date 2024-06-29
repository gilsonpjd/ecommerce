package com.project.eCommerce.dto.orderDTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;

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
