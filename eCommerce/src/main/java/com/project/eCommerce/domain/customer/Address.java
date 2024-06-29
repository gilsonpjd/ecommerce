package com.project.eCommerce.domain.customer;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tb_address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idAddress;
    private String street;
    private String city;
    private String country;
}
