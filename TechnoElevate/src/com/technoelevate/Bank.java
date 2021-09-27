package com.technoelevate;
public class Bank 
{
	private String bankName;
	private String account_holder_name;
	private long num;
	private String account_num=bankName+num;
	private float balance;
	@SuppressWarnings("unused")
	private int pincode;

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAccount_holder_name() {
		return account_holder_name;
	}

	public void setAccount_holder_name(String account_holder_name) {
		this.account_holder_name = account_holder_name;
	}

	public long getNum() {
		return num;
	}

	public void setNum(long num) {
		this.num = num;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public String getAccount_num() {
		return account_num;
	}

	public Bank(String bankName, String account_holder_name, long num, String account_num, float balance) {

		this.bankName = bankName;
		this.account_holder_name = account_holder_name;
		this.num = num;
		this.account_num = bankName+num;
		this.balance = balance;
	}

	public Bank() {
		super();
	}

	public Bank(String bankName, String account_holder_name, long num, String account_num, float balance, int pincode) {

		this.bankName = bankName;
		this.account_holder_name = account_holder_name;
		this.num = num;
		this.account_num = account_num;
		this.balance = balance;
		this.pincode = pincode;
	}

	public void deposite(float amount){
		if(amount>0){
			this.balance=this.balance+amount;
		}else
			System.out.println("Insuffcient balance");
	}

	public void withdraw(float amount){
		if(amount>0 && amount<balance){
			balance=balance-amount;
		}
	}

	public void details(){
		System.out.println("Bank_Name:"+bankName+"\naccount_holder_name:"+account_holder_name+"\naccount_number:"+account_num+"\nBalance:"+balance);
	}

	public void setPincode(int pincode){
		this.pincode=pincode;
	}
}
