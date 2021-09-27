package com.te.customexception;

public class InvalidBalanceException extends RuntimeException {
	String msg;

	public InvalidBalanceException(String msg) {
		this.msg = msg;
	}
	@Override
	public String getMessage() {
		return msg;
	}
}
