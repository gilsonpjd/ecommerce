package com.project.ecommerce.domain.customer;

import com.project.ecommerce.domain.order.Order;
import com.project.ecommerce.dto.customerDTO.CustomerRequest;
import com.project.ecommerce.dto.customerDTO.CustomerResponse;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idCustomer;

    @Column(name = "name")
    private String name;

    @Column(name = "dateOfBirth")
    private Date dateOfBirth;

    @Column(name = "email")
    private String email;

    @Column(name = "Cpf")
    private String cpf;

    @OneToOne
    @JoinColumn(name = "address")
    private Address adress;

    @OneToMany(mappedBy = "customer")
    private List<Order> order;


    public Customer(CustomerRequest customerRequest) {

    }

    public Customer(CustomerResponse customerResponse) {

    }

    public void setAdress(String street, String city, String country) {

    }
}
