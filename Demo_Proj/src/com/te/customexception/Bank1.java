package com.te.customexception;

public class Bank1 {
	public void balance(int amount) {
		if(amount>10000) {
			throw new InvalidBalanceException("Please Deposit amount before withdrwaing more then balance");
		}else
			System.out.println("withdrew amount is :"+amount);
	}
}
