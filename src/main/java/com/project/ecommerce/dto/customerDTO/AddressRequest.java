package com.project.ecommerce.dto.customerDTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class AddressRequest {

    @Size(min = 3, max = 50)
    @NotBlank(message = "The street field cannot be empty.")
    private String street;

    @Size(min = 3, max = 50)
    @NotBlank(message = "The city field cannot be empty.")
    private String city;

    @Size(min = 3, max = 50)
    @NotBlank(message = "The  country field cannot be empty.")
    private String country;


}
