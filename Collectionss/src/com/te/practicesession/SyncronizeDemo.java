package com.te.practicesession;

public class SyncronizeDemo extends Thread {
	synchronized public void print(int x,int y) {
		for (int i = x; i < y; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
