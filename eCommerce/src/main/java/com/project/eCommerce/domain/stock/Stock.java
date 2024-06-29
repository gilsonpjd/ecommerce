package com.project.eCommerce.domain.stock;

import com.project.eCommerce.domain.product.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.UUID;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tb_stock")

public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idStock;

    @OneToMany
    @JoinColumn(name="idProduct")
    private List<Product> products;

    private Date lastUpdate;


}
