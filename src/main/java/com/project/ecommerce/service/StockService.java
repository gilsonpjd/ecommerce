package com.project.ecommerce.service;

import com.project.ecommerce.dto.productDTO.ProductConvert;
import com.project.ecommerce.dto.productDTO.ProductRequest;
import com.project.ecommerce.dto.productDTO.ProductResponse;
import com.project.ecommerce.repositories.StockRepository;
import org.springframework.stereotype.Service;

@Service
public class StockService {

    private StockRepository stockRepository;
    private ProductService productService;
    private ProductConvert productConvert;

    public StockService(StockRepository stockRepository, ProductService productService, ProductConvert productConvert) {
        this.stockRepository = stockRepository;
        this.productService = productService;
        this.productConvert = productConvert;
    }


    public ProductResponse addProductStock(ProductRequest productRequest, int quantity) {
        return null;
    }
}
