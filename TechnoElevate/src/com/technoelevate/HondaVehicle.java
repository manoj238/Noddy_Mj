package com.technoelevate;
public class HondaVehicle 
{
	static String companyname="Honda";
	String vehicleName;
	int vehicleNo;
	int cc;
	int milage;
	int price;
	String maxSpeed;
	
	public void move()
	{
		System.out.println(vehicleName + " " + "with " + maxSpeed + " " +"will get you in Rs:"+ " "+price);
	}
		
	public void setPrice(int price){
		this.price=price;
	}

	public HondaVehicle(String vehicleName, int vehicleNo, int cc, int milage, int price, String maxSpeed) {
		super();
		this.vehicleName = vehicleName;
		this.vehicleNo = vehicleNo;
		this.cc = cc;
		this.milage = milage;
		this.price = price;
		this.maxSpeed = maxSpeed;
	}

	public HondaVehicle(String vehicleName, int vehicleNo, int cc, int milage, String maxSpeed) {
		super();
		this.vehicleName = vehicleName;
		this.vehicleNo = vehicleNo;
		this.cc = cc;
		this.milage = milage;
		this.maxSpeed = maxSpeed;
	}

	public HondaVehicle() 
	{
	}
	
	
	
}
