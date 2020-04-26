package com.spring.database.databasedemo.jpa;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@SpringBootApplication
public class DatabaseJPADemoApplication implements CommandLineRunner {
	
	private  Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJpaRepository personJpaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DatabaseJPADemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub 
		LOGGER.info("Inserting -> {}", personJpaRepository.insertPerson(new Person("Pooja", "Raichur", new Date())));
		LOGGER.info("Inserting -> {}", personJpaRepository.insertPerson(new Person("Rizwan", "Raichur", new Date())));
		LOGGER.info("Inserting -> {}", personJpaRepository.insertPerson(new Person("Mohammed", "Raichur", new Date())));
		LOGGER.info("Inserting -> {}", personJpaRepository.insertPerson(new Person("Rohila", "Raichur", new Date())));
		
		LOGGER.info("Updating 10004 -> {}", personJpaRepository.updatePerson(new Person(1, "Mariam", "Raichur", new Date())));
		
		LOGGER.info("The persons of id {}", personJpaRepository.findById(1));
		
		LOGGER.info("All Persons {}", personJpaRepository.findAllPersons());
		
		
		personJpaRepository.deleteById(1);
		
 
		
		
	}

}
