package com.example.springjpahibernate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User_table")
public class User {

	public User() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	
	
    private int salary;
	
	
	private String teamName;
	
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}


	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}


	/**
	 * @return the teamName
	 */
	public String getTeamName() {
		return teamName;
	}


	/**
	 * @param teamName the teamName to set
	 */
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	public User(Integer id, String name, int salary, String teamName) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.teamName = teamName;
	}



	
	
	
	
	
	

}
