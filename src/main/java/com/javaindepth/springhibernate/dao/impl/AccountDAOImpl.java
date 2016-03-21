package com.javaindepth.springhibernate.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.javaindepth.springhibernate.beans.Account;
import com.javaindepth.springhibernate.dao.AccountDAO;
@Repository
public class AccountDAOImpl extends SessionFactoryImpl implements AccountDAO{

	@Override
	public void insertAccount(Account account) {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(account);
		session.getTransaction().commit();
	}

	@Override
	public List<Account> listAccount() {
	Session session=getSessionFactory().getCurrentSession();
	session.beginTransaction();
	Criteria criteria = session.createCriteria(Account.class);
	List<Account> list = (List<Account>)criteria.list();
	return list;
	}

}
