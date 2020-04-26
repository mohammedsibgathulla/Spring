package com.spring.database.databasedemo.springdatajpa;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
 
 
 

@SpringBootApplication 
public class DatabaseSprindDataDemoApplication implements CommandLineRunner {
	
	private  Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonSpringDataRepository personJpaRepository;
	
	@Autowired
	EmployeeSpringDataRepository employeeSpringDataRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DatabaseSprindDataDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub  
		LOGGER.info("Inserting -> {}", personJpaRepository.save(new Person("Pooja", "Raichur", new Date())));
		LOGGER.info("Inserting -> {}", personJpaRepository.save(new Person("Rizwan", "Raichur", new Date())));
		LOGGER.info("Inserting -> {}", personJpaRepository.save(new Person("Mohammed", "Raichur", new Date())));
		LOGGER.info("Inserting -> {}", personJpaRepository.save(new Person("Rohila", "Raichur", new Date())));
		
		LOGGER.info("Updating 10004 -> {}", personJpaRepository.save(new Person(1, "Mariam", "Raichur", new Date())));
		
		LOGGER.info("The persons of id {}", personJpaRepository.findById(1));
		
		LOGGER.info("All Persons {}", personJpaRepository.findAll());
		
		
		personJpaRepository.deleteById(1);
		
		
		
		LOGGER.info("Inserting -> {}", employeeSpringDataRepository.save(new Employee("Pooja", "Raichur", "8050000511")));
		LOGGER.info("Inserting -> {}", employeeSpringDataRepository.save(new Employee("Rizwan", "Raichur", "8050000511"))); 
		LOGGER.info("Inserting -> {}", employeeSpringDataRepository.save(new Employee("Dahand", "Raichur", "8050000511"))); 
		
 
		
		
	}

}
