package com.project.eCommerce.domain.order;

import com.project.eCommerce.domain.product.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name="tb_productOrder")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProductOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idProductOrder;

    private Product product;

    private int quantity;
    private BigDecimal valueOrderProduct;

}
