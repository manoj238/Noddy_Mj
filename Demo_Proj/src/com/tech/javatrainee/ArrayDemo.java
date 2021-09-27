package com.tech.javatrainee;

import java.util.Arrays;

public class ArrayDemo {


	public static void main(String[] args) { 
		int arr[]= {10,20,30,40,50,60,70};
		int arr1[]=new int[5];

		/*
		 * for (int i : arr) { 
		 * System.out.println(i); 
		 * }
		 */

		/*
		 * for(int i=0;i<arr.length;i++) { 
		 * arr1[i]=arr[i]; 
		 * System.out.println(arr1[i]);
		 * }
		 */
		
		System.arraycopy(arr, 0, arr1, 0, arr1.length);
		System.out.println(Arrays.toString(arr1));
	}
}
