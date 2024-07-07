package com.project.ecommerce.exception;

public class StockNotFoundProductException extends RuntimeException {
    public StockNotFoundProductException(String message) {
        super(message);
    }
}
