package com.ecommerce.ecommerce.mappers;

import org.mapstruct.Mapper;

import com.ecommerce.ecommerce.dtos.ProductDto;
import com.ecommerce.ecommerce.entities.Product;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductDto toDto(Product product);
}








