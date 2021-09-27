package com.te.multithreading;

public class ThreadDemo implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 26; i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
