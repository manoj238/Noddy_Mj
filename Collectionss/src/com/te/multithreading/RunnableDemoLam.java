package com.te.multithreading;

public class RunnableDemoLam {

	public static void main(String[] args) {
		Runnable runnable = () -> {
			for (int i = 1; i < 27; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(i);
			}
		};
		
		Runnable runnable2 = () -> {
			for (char i = 'a'; i <= 'z'; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(i);
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
		Thread thread1 = new Thread(runnable2);
		thread1.start();
	}
	
	
}
