package com.project.ecommerce.domain.order;

import com.project.ecommerce.domain.product.Product;
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
@Table(name="tb_product_orders")
public class ProductOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idProductOrder;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "valueOrderProduct")
    private BigDecimal valueOrderProduct;

    @OneToMany
    @JoinColumn(name="idProduct")
    private List<Product> product;
}
