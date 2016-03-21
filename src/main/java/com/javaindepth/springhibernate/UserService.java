package com.javaindepth.springhibernate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.javaindepth.springhibernate.beans.User;
import com.javaindepth.springhibernate.dao.UserDAO;

@Component("usr")
public class UserService {
	private UserDAO userDao;

	public UserDAO getUserDao() {
		return userDao;
	}
	@Autowired
	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}
	
	public void addUser(User user){
		getUserDao().insertUser(user);
	}
	
	public List<User> listAllUsers(){
		return getUserDao().selectAllUsers();
	}
}
