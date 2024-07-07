package com.project.ecommerce.domain.product;

import com.project.ecommerce.dto.productDTO.ProductRequest;
import com.project.ecommerce.dto.productDTO.ProductResponse;
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
@Table(name="tb_products")

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idProduct;

    @Column(name = "nameProduct")
    private String nameProduct;

    @Column(name = "brand")
    private Brand brand;

    @Column(name = "type")
    private TypeProduct type;

    @Column(name = "value")
    private BigDecimal value;


    public Product(ProductRequest productRequest) {

    }

    public Product(ProductResponse productResponse) {

    }

    public void setType(String type) {

    }

    public void setBrand(String brand) {
    }

    public void setValue(double value) {

    }
}
