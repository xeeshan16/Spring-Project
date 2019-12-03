package com.zeeshan.spring.springcore.dependencycheckassignment;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;


public class University {

	private int id;
	private String name;
	private List<String> location;

	public int getId() {
		return id;
	}
    @Required
	public void setId(int id) {
		this.id = id;
	}
    
	public String getName() {
		return name;
	}
    @Required
	public void setName(String name) {
		this.name = name;
	}

	public List<String> getLocation() {
		return location;
	}

	public void setLocation(List<String> location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "University [id=" + id + ", name=" + name + ", location=" + location + "]";
	}

}
