package com.learn.dao;

import java.util.LinkedList;
import java.util.List;

import com.learn.AccoutException.AccountNotFoundException;
import com.learn.dto.BankAccount;

public class BankAccountDAOImpl implements  BankAccountDAO {

	List<BankAccount> accountList= new LinkedList<>();
	@Override
	public void addNewBankAccount(BankAccount account) {
		// TODO Auto-generated method stub
		if(accountList.contains(account))
			System.out.println("Account Already Exists");
		else
			accountList.add(account);
		
	}

	@Override
	public void removeBankAccount(BankAccount account) throws AccountNotFoundException {
		// TODO Auto-generated method stub
		if(accountList.contains(account))
			accountList.remove(account);
		else
			throw new AccountNotFoundException("Account Do Not Exhists");
		
	}

	@Override
	public void updateBankAccount(BankAccount account) throws AccountNotFoundException {
		// TODO Auto-generated method stub
		if(accountList.contains(account))
		{
		int index=accountList.indexOf(account);
		accountList.set(index, account);
		}
		else
		{
			
			throw new AccountNotFoundException("Account Do Not Exhists");
		}
		
	}

	@Override
	public List<BankAccount> showlAllBankAccounts() {
		// TODO Auto-generated method stub
		return accountList;
	}

}
