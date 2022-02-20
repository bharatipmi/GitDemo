package com.learn.service;

import java.util.List;

import com.learn.AccoutException.AccountNotFoundException;
import com.learn.dao.BankAccountDAO;
import com.learn.dao.BankAccountDAOImpl;
import com.learn.dto.BankAccount;

public class BankAccountService implements BankAccountServiceInterface {


	BankAccountDAO bdao= new BankAccountDAOImpl();	
     

	@Override
	public void addNewBankAccount(BankAccount account) {
		// TODO Auto-generated method stub
		bdao.addNewBankAccount(account);
	}

	@Override
	public void removeBankAccount(BankAccount account) throws AccountNotFoundException {
		// TODO Auto-generated method stub
		bdao.removeBankAccount(account);
	}

	@Override
	public void updateBankAccount(BankAccount account) throws AccountNotFoundException {
		// TODO Auto-generated method stub
		bdao.updateBankAccount(account);
	}

	@Override
	public List<BankAccount> showlAllBankAccounts() {
		// TODO Auto-generated method stub
		System.out.println("Account holders");
		return bdao.showlAllBankAccounts();
	}

}
