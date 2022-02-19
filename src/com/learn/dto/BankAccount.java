package com.learn.dto;

public class BankAccount {
   
	private int account_number;
	private String customerName;
	private int account_balance;
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankAccount(int account_number, String customerName, int account_balance) {
		super();
		this.account_number = account_number;
		this.customerName = customerName;
		this.account_balance = account_balance;
	}
	public int getAccount_number() {
		return account_number;
	}
	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getAccount_balance() {
		return account_balance;
	}
	public void setAccount_balance(int account_balance) {
		this.account_balance = account_balance;
	}
	@Override
	public String toString() {
		return "BankAccount [account_number=" + account_number + ", customerName=" + customerName + ", account_balance="
				+ account_balance + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + account_number;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		if (account_number != other.account_number)
			return false;
		return true;
	}

}
