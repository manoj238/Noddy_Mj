package com.te.practic;

public class Test1 {

	public static void main(String[] args) {
			GoDown down = new GoDown(100);
			Manufacture manufacture = new Manufacture(down, 200);
			manufacture.start();
			Customer customer = new Customer(400, down);
			customer.start();
			Manufacture manufacture1 = new Manufacture(down, 200);
			manufacture1.start();
		
//		GoDown godown = new GoDown(100);
//
//		Customer customer = new Customer(60, godown);
//		customer.start();
//
//		Customer customer2 = new Customer(70, godown);
//		customer2.start();
//		
//		Manufacture manufacturer = new Manufacture(godown, 100);
//		manufacturer.start();
	}

}
