package com.spring.database.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner {
	
	private  Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJdbcDao personJdbcDao;
	
	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		LOGGER.info("The persons are {}", personJdbcDao.getPersons());
		// We don't need to write the below code by overrideing the toString method in the Person class.
		
//		for(Person person: personJdbcDao.getPersons()) {
//			LOGGER.info("Person details {}", person.id);
//			LOGGER.info("Person details {}", person.name);
//			LOGGER.info("Person details {}", person.location);
//			LOGGER.info("Person details {}", person.birth_date);
//		}
		LOGGER.info("The persons of id 10001 {}", personJdbcDao.findById(10001));
		
		LOGGER.info("The No. of Persons Deleted is -> {}", personJdbcDao.deleteById(10001));
		
		LOGGER.info("Inserting 10004 -> {}", personJdbcDao.insertPerson(new Person("10004", "Pooja", "Raichur", new Date())));
		
		LOGGER.info("Updating 10004 -> {}", personJdbcDao.updatePerson(new Person("10004", "Mariam", "Raichur", new Date())));
		
		
		
	}

}
