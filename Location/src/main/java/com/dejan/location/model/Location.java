package com.dejan.location.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity		//mapping to data base table location
public class Location {

	//creating fields according to data base location
	@Id
	private int id;
	private String code;
	private String name;
private String type;

	//generate getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	//generate toString for printing object
	@Override
	public String toString() {
		return "Location [id=" + id + ", code=" + code + ", name=" + name + ", type=" + type + "]";
	}
	
	
}
