package com.project.ecommerce.dto.productDTO;

import com.project.ecommerce.domain.product.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductConvert {
    public Product ProductRequestToDomain(ProductRequest productRequest){
        return new Product(productRequest);
    }

    public Product ProductResponseToDomain(ProductResponse productResponse){
        return new Product(productResponse);
    }

    public ProductResponse toResponse(Product product) {
        return new ProductResponse(product);
    }

}
