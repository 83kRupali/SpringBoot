package com.ecommerce.ecommerce.controller;

import com.ecommerce.ecommerce.dtos.ProductDto;
import com.ecommerce.ecommerce.entities.Product;
import com.ecommerce.ecommerce.mappers.ProductMapper;
import com.ecommerce.ecommerce.repositories.ProductRepository;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductController(ProductRepository productRepository,
                             ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    @GetMapping
    public List<ProductDto> getAllProducts(
            @RequestHeader(required = false, name = "x-auth-token") String authToken,
            @RequestParam(name = "categoryId", required = false) Byte categoryId
    ) {
        List<Product> products;

        if (categoryId != null) {
            products = productRepository.findByCategoryId(categoryId);
        } else {
            products = productRepository.findAll();
        }

        return products.stream()
                .map(productMapper::toDto)
                .toList();
    }
}




















