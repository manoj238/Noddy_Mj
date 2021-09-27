package com.techno.collectionmain;

import java.util.ArrayList;
import java.util.Collections;

import com.tech.collectionframework.Student;

public class StudentMain {

	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList();
		arrayList.add(new Student(10,"Dean",52));
		arrayList.add(new Student(40,"Sam",26));
		arrayList.add(new Student(20,"Mary",46));
		arrayList.add(new Student(15,"Jhon",24));
		
		
		//iterate using foreach loop
		System.out.println("------Before Sorting---------");
		for (Student student : arrayList) {
			System.out.println(student);
		}
		System.out.println("------After Sorting---------");
		Collections.sort(arrayList);
		for (Student student : arrayList) {
			System.out.println(student);
		}
	}
}
