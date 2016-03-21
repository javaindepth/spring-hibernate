package com.javaindepth.springhibernate.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaindepth.springhibernate.beans.User;
import com.javaindepth.springhibernate.dao.UserDAO;
@Repository
public class UserDAOImpl implements UserDAO {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public int insertUser(User user) {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		System.out.println("orginal");
		return 0;	
	}

	@Override
	public List<User> selectAllUsers() {
		Session session=getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Criteria createCriteria = session.createCriteria(User.class);
		List<User> list = (List<User>)createCriteria.list();
		return list;
	}

}
