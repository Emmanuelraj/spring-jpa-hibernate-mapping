package com.example.springjpahibernate.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springjpahibernate.model.User;
import com.example.springjpahibernate.model.UserContact;
import com.example.springjpahibernate.service.UserContactService;
import com.example.springjpahibernate.service.UserService;

@RestController
public class UserController 
{
	
	
	
	@Autowired
    UserService userService;
	
	
	
	@Autowired
	UserContactService userContactService;
	
	
	
	@PostMapping("/load")
	public String  saveMethod(@RequestBody final User user)
	{
		userService.saveData(user);
		
		return  "save" ;
	}
	

	/**
	 * *
	 * @return
	 */
	@GetMapping("/all")
	public List<User> fetchDataMethod()
	{
		return userService.findAll();
	}
	
	
	/**
	*/
	@GetMapping("/{name}")
	public List<User> getUser(@PathVariable("name") final String name)
	{
		
		List<User> listOptional =userService.findByName(name);
			return listOptional;
	}
	
	
	
	@PutMapping("/update/{id}/{name}")
	public User updateUserById(@PathVariable("id") int id, @PathVariable("name") String name)
	{
		
		Optional<User> ls =userService.findById(id);
		User user =  new User();		
		user.setName(name);		
		return userService.save(user);
		
	}
	
	
	
	@DeleteMapping("/delete/{id}")
	public List<User> delete(@PathVariable("id")int id)
	{
		userService.deleteById(id);
		
		return userService.findAll();
	}
	
	
	
	
	
	
	
	
}
