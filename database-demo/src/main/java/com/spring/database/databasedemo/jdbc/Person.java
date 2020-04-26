package com.spring.database.databasedemo.jdbc;

import java.util.Date;

public class Person {
	String id;
	String name;
	String location;
	Date birth_date;
	
	public Person() {} //You have to provide the default constructor if you are using the below constructor or else u will get No default constructor found; nested exception 
	

	public Person(String id, String name, String location, Date birth_date) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.birth_date = birth_date;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
