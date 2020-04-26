package com.spring.database.databasedemo.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeSpringDataRepository extends JpaRepository<Employee, Integer>{

}
