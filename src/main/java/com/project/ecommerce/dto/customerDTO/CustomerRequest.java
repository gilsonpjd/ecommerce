package com.project.ecommerce.dto.customerDTO;

import com.project.ecommerce.domain.customer.Address;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class CustomerRequest {

    @NotBlank(message = "The name field cannot be empty.")
    @Size(min = 3, max = 50, message = "The attribute name must have between 3 and 50 characters.")
    private String name;

    @NotBlank(message = "The date field cannot be empty.")
    @Size(min = 8, max = 8)
    private Date dateOfBirth;

    @NotBlank(message = "The email field cannot be empty.")
    @Email
    private String email;

    @NotBlank(message = "The cpf field cannot be empty.")
    @Size(min = 11, max = 11, message = "The CPF must have 11 digits, no periods and no hyphen")
    private String cpf;

    @NotBlank(message = "The adress field cannot be empty.")
    @Size(min = 3, max = 100)
    private Address adress;

    public @NotBlank(message = "The name field cannot be empty.") @Size(min = 3, max = 50, message = "The attribute name must have between 3 and 50 characters.") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "The name field cannot be empty.") @Size(min = 3, max = 50, message = "The attribute name must have between 3 and 50 characters.") String name) {
        this.name = name;
    }

    public @NotBlank(message = "The date field cannot be empty.") @Size(min = 8, max = 8) Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(@NotBlank(message = "The date field cannot be empty.") @Size(min = 8, max = 8) Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public @NotBlank(message = "The email field cannot be empty.") @Email String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "The email field cannot be empty.") @Email String email) {
        this.email = email;
    }

    public @NotBlank(message = "The cpf field cannot be empty.") @Size(min = 11, max = 11, message = "The CPF must have 11 digits, no periods and no hyphen") String getCpf() {
        return cpf;
    }

    public void setCpf(@NotBlank(message = "The cpf field cannot be empty.") @Size(min = 11, max = 11, message = "The CPF must have 11 digits, no periods and no hyphen") String cpf) {
        this.cpf = cpf;
    }

    public @NotBlank(message = "The adress field cannot be empty.") @Size(min = 3, max = 100) Address getAdress() {
        return adress;
    }

    public void setAdress(@NotBlank(message = "The adress field cannot be empty.") @Size(min = 3, max = 100) Address adress) {
        this.adress = adress;
    }
}

