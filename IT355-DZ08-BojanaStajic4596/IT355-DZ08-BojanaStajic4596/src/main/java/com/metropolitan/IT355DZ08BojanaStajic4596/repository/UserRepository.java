package com.metropolitan.IT355DZ08BojanaStajic4596.repository;

import com.metropolitan.IT355DZ08BojanaStajic4596.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String username);
}

