package com.javaindepth.springhibernate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.javaindepth.springhibernate.beans.Account;
import com.javaindepth.springhibernate.dao.AccountDAO;

@Component("accService")
public class AccountService {

	private AccountDAO accountDAO;

	public AccountDAO getAccountDAO() {
		return accountDAO;
	}

	@Autowired
	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}

	public void insertAccount(Account acc) {
		getAccountDAO().insertAccount(acc);
	}

	public List<Account> listAllAccounts() {
		return getAccountDAO().listAccount();
	}

}
