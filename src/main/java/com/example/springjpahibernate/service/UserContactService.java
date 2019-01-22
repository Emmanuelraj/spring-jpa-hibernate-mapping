package com.example.springjpahibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.springjpahibernate.interfaces.UserContactRepository;
import com.example.springjpahibernate.model.User;
import com.example.springjpahibernate.model.UserContact;

@Service
public class UserContactService  {
	
	@Autowired
	UserContactRepository userContactRepository;

	
	
	public List<UserContact> load()
	{
		return this.userContactRepository.findAll();
	}
	
	
	public List<UserContact> findAll(final UserContact userContact)
	{
		
		
		return this.userContactRepository.findAll();
	}
	
	
	public List<UserContact>  loadData(final UserContact userContact)
	{
		  userContactRepository.save(userContact);
		  
		  return  this.userContactRepository.findAll();
	}
	
}
