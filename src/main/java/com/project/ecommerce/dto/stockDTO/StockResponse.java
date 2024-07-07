package com.project.ecommerce.dto.stockDTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class StockResponse {

    @NotBlank(message = "The date field cannot be empty.")
    @Size(min = 8, max = 8)
    private Date lastUpdateDTO;

}
