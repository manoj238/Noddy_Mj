package com.te.multithreading;
public class MainThreadDemo {

	public static void main(String[] args) {
		Runnable runnable = new ThreadDemo();
		Thread thread = new Thread(runnable);
		thread.start();
		for (int i = 26; i < 40; i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
