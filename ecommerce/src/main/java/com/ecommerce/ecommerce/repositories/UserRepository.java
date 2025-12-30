package com.ecommerce.ecommerce.repositories;

import com.ecommerce.ecommerce.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
