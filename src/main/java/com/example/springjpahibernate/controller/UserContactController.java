package com.example.springjpahibernate.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springjpahibernate.model.User;
import com.example.springjpahibernate.model.UserContact;
import com.example.springjpahibernate.service.UserContactService;

@RestController
public class UserContactController 
{
	
	
	@Autowired
	UserContactService userContactService;
	
	
	
	
	@GetMapping("/userContact/load")
	public List<UserContact> getUserContact()
	{
		return userContactService.load();
	}
	
	
	
	
	
	@GetMapping("/updateUserContact/{name}")
	public List<UserContact> updateData(@PathVariable("name")String name)
	{
		
		UserContact userContact = new UserContact();
		
		User user = new User();
		
		user.setName(name);
		
		user.setSalary(1000);
		
		
		
		user.setTeamName("youtube");
		
	   
		
		
		userContact.setPhoneNo(1111);
		userContact.setUsers(user);
		
		
		userContactService.loadData(userContact);
		
		return userContactService.findAll(userContact);
	}
	
	
	
	
	
	


}
