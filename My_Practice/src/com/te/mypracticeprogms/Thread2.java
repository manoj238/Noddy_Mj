package com.te.mypracticeprogms;

public class Thread2 implements Runnable {

	@Override
	 public void run() {
		for(int i = 1;i<11;i++) {
			try {
				Thread.sleep(900);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
