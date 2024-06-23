package com.project.eCommerce.dto.stockDTO;

import com.project.eCommerce.dto.productDTO.ProductResponse;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class StockRequest {

    private UUID idStockDTO;
    private List<ProductResponse> productsDTO;
    private Date lastUpdateDTO;
}
