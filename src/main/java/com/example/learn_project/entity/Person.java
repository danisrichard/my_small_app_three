package com.example.learn_project.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Person {

	String name;
	
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
