package com.te.customexception;

public class InsufficentBalanceException extends Exception{
	String msg;

	public InsufficentBalanceException(String msg) {
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		return msg;
	}
}
