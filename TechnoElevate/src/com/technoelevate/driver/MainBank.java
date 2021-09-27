package com.technoelevate.driver;

import com.technoelevate.Bank;

public class MainBank {

	public static void main(String[] args)
	{
		Bank bank=new Bank();
		Bank bank1=new Bank("KotakBank", "Manoj", 145410101116l, "kotak",00);
		bank1.details();
		System.out.println("Deposited amount: Rs:10000");
		bank1.setPincode(1234);
		System.out.println("******************************");
		bank1.deposite(10000);
		bank1.details();
		System.out.println("******************************");
		bank1.withdraw(2000);
		bank1.details();
	}

}
