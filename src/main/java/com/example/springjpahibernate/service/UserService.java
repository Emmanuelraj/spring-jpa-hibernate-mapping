package com.example.springjpahibernate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.example.springjpahibernate.interfaces.UserJpaRepository;
import com.example.springjpahibernate.model.User;




@Service
public class UserService 
{

	@Autowired
	UserJpaRepository jpaRepository;
	
	
	public List<User> saveData(User user)
	{
		
		this.jpaRepository.save(user);
		
		return this.jpaRepository.findAll();
		
	}
	
	
	
	public List<User> findAll()
	{
		
		
		return this.jpaRepository.findAll();
		
	}



	public Optional<User> findById(int id) {
		// TODO Auto-generated method stub
		return this.jpaRepository.findById(id);
	}



	public User save(User user) {
		// TODO Auto-generated method stub
		return this.jpaRepository.save(user);
	}



	public List<User> findByName(String name) {
		// TODO Auto-generated method stub
		return this.jpaRepository.findByName(name);
	}



	public List<User> deleteById(int id) {
		// TODO Auto-generated method stub
		
		this.jpaRepository.deleteById(id);
		return this.jpaRepository.findAll();
	}
	
	
	
	

}
