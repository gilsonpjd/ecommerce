package com.project.eCommerce.domain.customer;

import com.project.eCommerce.domain.order.Order;
import com.project.eCommerce.dto.customerDTO.CustomerRequest;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tb_customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idCustomer;

    private String userName;

    @ManyToMany
    @JoinColumn(name="idAddress")
    private Address adress;

    @OneToMany
    private List<Order> order;

    public Customer(CustomerRequest customerRequest) {

    }
}
