package com.spring.database.databasedemo;

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
	}

}
