package com.example.springjpahibernate.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springjpahibernate.model.User;

@Repository
public interface UserJpaRepository extends JpaRepository<User, Integer> 
{
    List<User> findByName(String name);
    
    
    
}
