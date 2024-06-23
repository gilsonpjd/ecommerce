package com.project.eCommerce.dto.customerDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@AllArgsConstructor
@NoArgsConstructor

public class AddressRequest {

    private String streetDTO;
    private String cityDTO;
    private String countryDTO;
}
