package com.te.comparator;

public class InvalidInputException extends RuntimeException {
	String msg;

	public InvalidInputException(String msg) {
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		return msg;
	}
	
}
