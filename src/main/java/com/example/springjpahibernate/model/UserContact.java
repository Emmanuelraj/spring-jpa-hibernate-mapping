package com.example.springjpahibernate.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="user_contact")
public class UserContact {

	public UserContact() {
		// TODO Auto-generated constructor stub
	}
	
	
     @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 @Column(name="id")
	 private Integer id;
	
	
	 private Integer phoneNo;


	  @OneToOne(cascade=CascadeType.ALL)
	  @JoinColumn(name="user_id",referencedColumnName="user_id")
	  private User users;
	 
	 
	 
	/**
	 * @return the users
	 */
	public User getUsers() {
		return users;
	}


	/**
	 * @param users the users to set
	 */
	public void setUsers(User users) {
		this.users = users;
	}


	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}


	/**
	 * @return the phoneNo
	 */
	public Integer getPhoneNo() {
		return phoneNo;
	}


	/**
	 * @param phoneNo the phoneNo to set
	 */
	public void setPhoneNo(Integer phoneNo) {
		this.phoneNo = phoneNo;
	}

	
	
	
	
	
}
