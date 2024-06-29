package com.project.eCommerce.dto.customerDTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class AddressResponse {

    @Size(min = 3, max = 50)
    @NotBlank(message = "The street field cannot be empty.")
    private String streetDTO;

    @Size(min = 3, max = 50)
    @NotBlank(message = "The city field cannot be empty.")
    private String cityDTO;

    @Size(min = 3, max = 50)
    @NotBlank(message = "The  country field cannot be empty.")
    private String countryDTO;
}
