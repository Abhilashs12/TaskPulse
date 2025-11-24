package com.abhi.main.respository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhi.main.entity.User;

public interface UserRespository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);

    boolean existsByUsername(String username);
}
