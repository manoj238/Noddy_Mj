package com.te.practicesession;

public class Test2 extends Thread{
	int x;
	int y;
	SyncronizeDemo demo;
	public Test2(int x, int y, SyncronizeDemo demo) {
		this.x = x;
		this.y = y;
		this.demo = demo;
	}

	
	
	@Override
	
	 public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		demo.print(x,y);
	}
}
