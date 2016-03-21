package com.javaindepth.springhibernate.dao;

import java.util.List;

import com.javaindepth.springhibernate.beans.User;
public interface UserDAO {

	public int insertUser(User user);
	public List<User> selectAllUsers();
}
