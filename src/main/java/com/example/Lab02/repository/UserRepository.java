package com.example.Lab02.repository;
import com.example.Lab02.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, Long>{
    User findByUsername(String username);
}
