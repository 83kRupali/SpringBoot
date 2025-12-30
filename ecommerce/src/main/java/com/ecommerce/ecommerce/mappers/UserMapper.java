package com.ecommerce.ecommerce.mappers;

import com.ecommerce.ecommerce.dtos.UserDto;
import com.ecommerce.ecommerce.entities.User;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import com.ecommerce.ecommerce.dtos.RegisterUserRequest;
import com.ecommerce.ecommerce.dtos.UpdateUserRequest;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
    User toEntity(RegisterUserRequest request);
    void update(UpdateUserRequest request, @MappingTarget User user);
}
