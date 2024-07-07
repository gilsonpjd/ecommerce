package com.project.ecommerce.service;

import com.project.ecommerce.domain.product.Product;
import com.project.ecommerce.dto.productDTO.ProductConvert;
import com.project.ecommerce.dto.productDTO.ProductRequest;
import com.project.ecommerce.dto.productDTO.ProductResponse;
import com.project.ecommerce.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductConvert productConvert;

    public ProductService(ProductConvert productConvert, ProductRepository productRepository) {
        this.productConvert = productConvert;
        this.productRepository = productRepository;
    }

    public ProductResponse createProduct(ProductRequest productRequest) {
        return productConvert.toResponse(productRepository.save(new Product(productRequest)));
    }

    public List<ProductResponse> findAllProduct() {
        List<Product> allProducts = productRepository.findAll();
        return allProducts.stream()
                .map(productConvert::toResponse )
                .collect(Collectors.toList());
    }

    public ProductResponse findByName(String name) {
        return productConvert.toResponse(productRepository.findByName(name));
    }

    public ProductResponse findByBrand(String brand) {
        return productConvert.toResponse(productRepository.findByBrand(brand));

    }

    public ProductResponse updateProduct(String name, ProductRequest productRequest) {
        Product byName = productRepository.findByName(name);
        byName.setNameProduct(productRequest.getNameProduct());
        byName.setType(productRequest.getType());
        byName.setBrand(productRequest.getBrand());
        byName.setValue(productRequest.getValue());
        return productConvert.toResponse(productRepository.save(byName));
    }

    public void deleteProduct(String name) {
        productRepository.delete(productRepository.findByName(name));
    }
}
