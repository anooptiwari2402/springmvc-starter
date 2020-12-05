package com.tech.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MyModel {

	@Id
	private int id;
	private String name;
	private String password;
	public MyModel() {
		super();
	}
	public MyModel(int id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "MyModel [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
	
}
