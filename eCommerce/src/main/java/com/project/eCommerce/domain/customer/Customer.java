package com.project.eCommerce.domain.customer;

import com.project.eCommerce.domain.order.Order;
import com.project.eCommerce.dto.customerDTO.CustomerRequest;
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
@Table(name="tb_customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idCustomer;

    @Column(name = "name")
    private String userName;

    @Column(name = "dateOfBirth")
    private Date dateOfBirth;

    @Column(name="email")
    private String email;

    @Column(name="cpf")
    private String cpf;

    @OneToOne
    @JoinColumn(name="address")
    private Address adress;

    @OneToMany(mappedBy = "customer")
    private List<Order> order;

    public Customer(CustomerRequest customerRequest) {

    }
}
