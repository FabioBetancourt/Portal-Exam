package com.examenes.repository;

import com.examenes.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    public User findByUsername(String username); //find by Username this is a method give by JPA
}
