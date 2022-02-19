package com.learn.service;

import java.util.List;

import com.learn.AccoutException.AccountNotFoundException;
import com.learn.dto.BankAccount;

public interface BankAccountServiceInterface {
	void addNewBankAccount(BankAccount account);
	void removeBankAccount(BankAccount account) throws AccountNotFoundException;
	void updateBankAccount(BankAccount account) throws AccountNotFoundException;
	List<BankAccount> showlAllBankAccounts();

}
