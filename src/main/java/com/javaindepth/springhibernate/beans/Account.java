package com.javaindepth.springhibernate.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="Account")
public class Account {
private int _id;
private User user;
private String account_type;
private String account_number;

@Id
@Column (name="_id")
@GeneratedValue
public int get_id() {
	return _id;
}
public void set_id(int _id) {
	this._id = _id;
}
@OneToOne
@JoinColumn(name ="user_id")
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public String getAccount_type() {
	return account_type;
}
public void setAccount_type(String account_type) {
	this.account_type = account_type;
}
public String getAccount_number() {
	return account_number;
}
public void setAccount_number(String account_number) {
	this.account_number = account_number;
}

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.user.getName()+"-"+this.getAccount_number()+": "+this.getAccount_type();
	}

}
