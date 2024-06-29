package com.project.eCommerce.dto.customerDTO;

import com.project.eCommerce.domain.customer.Customer;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class CustomerResponse {

    @NotBlank(message = "The name field cannot be empty.")
    @Size(min = 3, max = 50, message = "The attribute name must have between 3 and 50 characters.")
    private String userNameDTO;

    @NotBlank(message = "The date field cannot be empty.")
    @Size(min = 8, max = 8)
    private Date dateOfBirth;

    @NotBlank(message = "The email field cannot be empty.")
    @Email
    private String email;

    @NotBlank(message = "The cpf field cannot be empty.")
    @Size(min = 11, max = 11, message = "The CPF must have 11 digits, no periods and no hyphen")
    private String cpf;
    public CustomerResponse(Customer customer) {

    }
}
