package com.project.eCommerce.domain.product;

import com.project.eCommerce.domain.stock.Stock;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tb_product")

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idProduct;
    private String nameProduct;
    private Brand brand;
    private TypeProduct type;
    private BigDecimal value;

    @ManyToOne
    private Stock stock;

}
