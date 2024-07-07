package com.project.ecommerce.domain.order;

import com.project.ecommerce.domain.customer.Customer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tb_orders")

public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idOrder;

    @Column(name="date")
    private Date date;

    @Column(name="status")
    private Status status;

    @Column(name="valueOrder")
    private BigDecimal valueOrder;

    @ManyToOne
    @JoinColumn(name="Customer")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name="ProductOrder")
    private ProductOrder productOrder;


}
