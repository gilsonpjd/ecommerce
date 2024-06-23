package com.project.eCommerce.stock;

import com.project.eCommerce.product.Product;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Stock {

    private List<Product> products;

    private Date lastUpdate;


}
