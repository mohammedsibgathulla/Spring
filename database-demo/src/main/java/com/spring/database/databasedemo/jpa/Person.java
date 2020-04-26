package com.spring.database.databasedemo.jpa;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
@Entity
@NamedQuery(name="find_all_persons", query="select p from Person p")
public class Person {
	@Id
	@GeneratedValue
	int id;
	String name;
	String location;
	Date birth_date;
	
	public Person() {} //You have to provide the default constructor if you are using the below constructor or else u will get No default constructor found; nested exception 
	
	public Person(String name, String location, Date birth_date) {
		this.name = name;
		this.location = location;
		this.birth_date = birth_date;
	}

	public Person(int id, String name, String location, Date birth_date) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.birth_date = birth_date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getBirth_date() {
		return birth_date;
	}
	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}

	
	@Override
	public String toString() {
		return "\n Person [id=" + id + ", name=" + name + ", location=" + location + ", birth_date=" + birth_date
				+ ", getId()=" + getId() + ", getName()=" + getName() + ", getLocation()=" + getLocation()
				+ ", getBirth_date()=" + getBirth_date() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
