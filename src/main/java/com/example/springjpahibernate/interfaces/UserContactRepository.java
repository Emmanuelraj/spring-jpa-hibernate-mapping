package com.example.springjpahibernate.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springjpahibernate.model.UserContact;

public interface UserContactRepository extends JpaRepository<UserContact, Integer>{

}
