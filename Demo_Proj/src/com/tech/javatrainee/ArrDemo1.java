package com.tech.javatrainee;

public class ArrDemo1 {

	public static void main(String[] args) {
		int arr[] = {10,12,34,2,6};
		int tm=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]<arr[i+1])
				tm=arr[i];
		}
		System.out.println(tm);
		
		int a=10;
		System.out.println(a=a++);
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(++a);
	}
//any veriables gothrough early binding
}
