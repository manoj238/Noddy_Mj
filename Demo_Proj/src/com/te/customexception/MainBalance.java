package com.te.customexception;

public class MainBalance {

	public static void main(String[] args) {
		Bank bank = new Bank();
		try {
			bank.balence(112000.56);
		} catch (InsufficentBalanceException e) {
			System.out.println(e.getMessage());
		}
	}
}
