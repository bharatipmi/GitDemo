package com.learn.client;

import java.util.List;

import com.learn.AccoutException.AccountNotFoundException;
import com.learn.dto.BankAccount;
import com.learn.service.BankAccountService;
import com.learn.service.BankAccountServiceInterface;

public class BankAccountClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccountServiceInterface bservice = new BankAccountService();
		bservice.addNewBankAccount(new BankAccount(1,"AA",8000));
		bservice.addNewBankAccount(new BankAccount(2,"BB",8900));
		bservice.addNewBankAccount(new BankAccount(3,"CC",8080));
		bservice.addNewBankAccount(new BankAccount(4,"DD",8050));
		List<BankAccount> accounts =bservice.showlAllBankAccounts();
		for(BankAccount act:accounts)
		{
			System.out.println(act);
		}
		BankAccount temp =new BankAccount(1,"AA",8000);
		try {
			bservice.removeBankAccount(temp);
		} catch (AccountNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(BankAccount act:accounts)
		{
			System.out.println(act);
		}
		
		BankAccount temp1 =new BankAccount(3,"rahj",8800);
		try {
			bservice.updateBankAccount(temp1);
		} catch (AccountNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("simple Test");
		accounts.stream().forEach(x->System.out.println(x));
	}

}
