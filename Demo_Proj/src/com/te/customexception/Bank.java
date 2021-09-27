package com.te.customexception;

public class Bank {
	public void balence(Double amount) throws InsufficentBalanceException {
		if(amount>100000) {
			throw new InsufficentBalanceException("Insufficent Balance.....!!!");
		}else {
			System.out.println("Your Balance Is: "+amount);
		}
	}
}
