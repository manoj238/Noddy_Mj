package com.te.practic;

public class GoDown {
//	int products;
//
//	synchronized public void store(int items) {
//		this.products += items;
//		System.out.println("items stored"+Thread.currentThread().getName());
//		this.notify();
//	}
//
//	public GoDown(int items) {
//		this.products = items;
//	}
//
//	synchronized public void purchase(int puritems) {
//		while (puritems > this.products) {
//			System.out.println("The items you want purchase is out of stock please wait....!!!"+Thread.currentThread().getName());
//
//			try {
//				this.wait();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//			products -= puritems;
//			System.out.println("Items purchased Succesfully"+Thread.currentThread().getName());
//		}
//	}
	int products;

	public GoDown(int products) {
		this.products = products;
	}

	synchronized public void store(int items) {
		this.products += items;
//		products = products + items;
		System.out.println("Items stored!!");
		this.notify();
	}

	synchronized public void purchase(int items) {
		while (items > this.products) {

			System.out.println("Out of stock! Please wait...");
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
//			

		}
		products -= items;
		System.out.println("Items successfully purchased!!");

	}
}
