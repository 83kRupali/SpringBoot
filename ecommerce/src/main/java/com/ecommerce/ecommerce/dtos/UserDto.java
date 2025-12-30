package com.ecommerce.ecommerce.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public record UserDto(
        @JsonProperty("user_id") Long id,
        String name
) {}
