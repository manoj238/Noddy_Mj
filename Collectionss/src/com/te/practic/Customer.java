package com.te.practic;

public class Customer extends Thread {
	GoDown down;
	int items;
	public Customer( int items,GoDown down) {
		this.down = down;
		this.items = items;
	}
	@Override
	public void run() {
		down.purchase(items);
	}
	
}
