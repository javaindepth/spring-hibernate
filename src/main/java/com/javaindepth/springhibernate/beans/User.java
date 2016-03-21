package com.javaindepth.springhibernate.beans;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@javax.persistence.Entity
@Table (name="User")
public class User {

	@Id
	@Column (name="user_id")
	@GeneratedValue
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private int user_id;
	private String name;
	private String email;
	
}
