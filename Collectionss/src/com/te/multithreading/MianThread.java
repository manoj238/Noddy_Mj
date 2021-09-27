package com.te.multithreading;

public class MianThread {

	public static void main(String[] args) {
		MultiThreadDemo demo = new MultiThreadDemo();
		demo.start();
		for (int i = 0; i < 27; i++) {
			System.out.println(i + " "+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
