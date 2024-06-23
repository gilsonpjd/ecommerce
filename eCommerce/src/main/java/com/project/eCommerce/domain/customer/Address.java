package com.project.eCommerce.domain.customer;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;

public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idAdress;
    private String street;
    private String city;
    private String country;
}
