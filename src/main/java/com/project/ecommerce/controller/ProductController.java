package com.project.ecommerce.controller;

import com.project.ecommerce.dto.customerDTO.CustomerResponse;
import com.project.ecommerce.dto.productDTO.ProductRequest;
import com.project.ecommerce.dto.productDTO.ProductResponse;
import com.project.ecommerce.exception.ProductNotFoundException;
import com.project.ecommerce.service.ProductService;
import io.swagger.annotations.ApiOperation;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @ApiOperation("Create an Product")
    @PostMapping
    public ResponseEntity<ProductResponse> createProduct(@RequestBody ProductRequest productRequest) {
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(productService.createProduct(productRequest));
        } catch (ProductNotFoundException ex) {
            throw new ProductNotFoundException("Unable to create product, review attributes");
        }
    }

    @ApiOperation("Find all products")
    @GetMapping
    public ResponseEntity<List<ProductResponse>> findAllProduct() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(productService.findAllProduct());
        } catch (ProductNotFoundException ex) {
            throw new ProductNotFoundException("There are no registered products");
        }

    }

    @ApiOperation("Find by name")
    @GetMapping("/products/{name}")
    public ResponseEntity<ProductResponse> findByName(@PathVariable String name) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(productService.findByName(name));
        } catch (ProductNotFoundException ex) {
            throw new ProductNotFoundException("Product not found: " + name);
        }
    }

    @ApiOperation("Find by brand")
    @GetMapping("/products/{brand}")
    public ResponseEntity<ProductResponse> findByBrand(@PathVariable String brand) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(productService.findByBrand(brand));
        } catch (ProductNotFoundException ex) {
            throw new ProductNotFoundException("Brand not found");
        }
    }

    @ApiOperation("Upadate product")
    @PutMapping("/products/{name}")
    public ResponseEntity<ProductResponse> updateProduct(@PathVariable String name, @RequestBody @Valid ProductRequest productRequest) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(productService.updateProduct(name, productRequest));
        } catch (ProductNotFoundException ex) {
            throw new ProductNotFoundException("Unable to update product data.");
        }
    }


    @ApiOperation("Delete Product")
    @PutMapping("/products/{name}")
    public ResponseEntity<CustomerResponse> deleteProduct(@PathVariable String name) {
        try {
            productService.deleteProduct(name);
            return ResponseEntity.noContent().build();
        } catch (ProductNotFoundException ex) {
            throw new ProductNotFoundException("Product not found: " + name);
        }
    }


}
