package com.te.practic;

public class Manufacture extends Thread{
	GoDown down;
	int items;
	public Manufacture(GoDown down, int items) {
		this.down = down;
		this.items = items;
	}
	@Override
	public void run() {
		down.store(items);
	}
}
