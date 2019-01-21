package com.example.springjpahibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.springjpahibernate.interfaces.UserJpaRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses=UserJpaRepository.class)
public class SpringJpaHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaHibernateApplication.class, args);
	}

}

