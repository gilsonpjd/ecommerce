package com.project.eCommerce.domain.order;

import com.project.eCommerce.domain.customer.Customer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name="tb_order")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idOrder;
    private Date date;
    private Status status;
    private BigDecimal valueOrder;

    @ManyToOne
    private Customer customer;

    private ProductOrder productOrder;


}
