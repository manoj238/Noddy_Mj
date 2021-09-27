package com.technoelevate.driver;

import com.technoelevate.HondaVehicle;

public class Vehicle 
{

	public static void main(String[] args) 
	{
		HondaVehicle hv=new HondaVehicle();
		HondaVehicle hv1=new HondaVehicle("Activa", 1, 110, 40 ,"85km/h");
		HondaVehicle hv2=new HondaVehicle("Activa125",2 , 125, 40,125000, "110km/h");
		
		hv.move();
		hv1.move();
		hv2.move();
	}

}
