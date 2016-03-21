package com.javaindepth.springhibernate.dao;

import java.util.List;

import com.javaindepth.springhibernate.beans.Account;

public interface AccountDAO {
	public void insertAccount(Account account);
	public List<Account> listAccount();
}
