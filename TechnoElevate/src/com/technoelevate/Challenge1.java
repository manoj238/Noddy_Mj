/*Design a method to accept user name and password of String type and 
	print with the message the user name successfully login*/
package com.technoelevate;
import java.util.Scanner;
public class Challenge1 
{	
	
	boolean flag;
	
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Username and password");
		this.logIn(sc.next(),sc.next());
	}
	
	public void logIn(String username,String password)
	{
		if(this.flag==false){
			this.flag=true;
			System.out.println(username + " "+ "Successfully Logged in");
		}else
			System.out.println(username+" "+ "already logged in");
	}	
	public int add(int num1,int num2){
		if(flag==true){	
			return num1+num2;
		}
		return 0;
	}
	public float add(float num1,float num2){
		if(flag==true){	
			return num1+num2;
		}
		return 0;
	}
	public double add(double num1,double num2){
		if(flag==true){	
			return num1+num2;
		}
		return 0;
	}
	public double add(double num1,int num2){
		if(flag==true){	
			return num1+num2;
		}
		return 0;
	}
	public String logOut(){
		if(flag){
			this.flag=false;
			return "Successfully log Out";
		}
			return "Please Login First";
	}
}
