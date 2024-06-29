package com.project.eCommerce.domain.order;

import com.project.eCommerce.domain.product.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tb_productOrder")
public class ProductOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idProductOrder;

    @OneToMany
    @JoinColumn(name="idProduct")
    private List<Product> product;

    private int quantity;
    private BigDecimal valueOrderProduct;

}
