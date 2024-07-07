package com.project.ecommerce.controller;

import com.project.ecommerce.dto.productDTO.ProductRequest;
import com.project.ecommerce.dto.productDTO.ProductResponse;
import com.project.ecommerce.service.StockService;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stocks")
public class StockController {

    private final StockService stockService;

    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @ApiOperation("add product to stock")
    @PostMapping
    public ResponseEntity<ProductResponse> addProduct(@RequestBody ProductRequest productRequest, int quantity) {
       return null;
    }
}
