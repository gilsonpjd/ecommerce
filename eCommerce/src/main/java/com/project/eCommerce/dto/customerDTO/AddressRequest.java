package com.project.eCommerce.dto.customerDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@Getter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class AddressRequest {

    private String streetDTO;
    private String cityDTO;
    private String countryDTO;
}
