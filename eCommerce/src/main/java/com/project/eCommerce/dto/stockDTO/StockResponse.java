package com.project.eCommerce.dto.stockDTO;

import com.project.eCommerce.dto.productDTO.ProductResponse;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class StockResponse {

    private UUID idStockDTO;
    private List<ProductResponse> productsDTO;
    private Date lastUpdateDTO;
}
