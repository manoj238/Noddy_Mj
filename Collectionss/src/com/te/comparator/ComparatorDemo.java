package com.te.comparator;
import java.util.*;
public class ComparatorDemo {
	public static void main(String[] args) {
		boolean res=true;
		Scanner scanner = new Scanner(System.in);
		ArrayList<Student> arrayList = new ArrayList<>();
		arrayList.add(new Student(12, "Manoj", 20, "Bangalore"));
		arrayList.add(new Student(5, "Vivek", 17, "Mysore"));
		arrayList.add(new Student(34, "Anurag", 30, "Mangalore"));
		arrayList.add(new Student(11, "Guru", 10, "Hubli"));
		while(res) {
			System.out.println("Enter your choice from given options:\n1)Sort By ID\n2)Sort By Name\n3)Sort By Age\n4)Sort By Place");
			String choice = scanner.next();
			switch (choice) {
			case "1":System.out.println("----Sort by id------");
			Collections.sort(arrayList, new SortById());
			for (Student student : arrayList) {
				System.out.println(student);
			}
			break;
			case "2":System.out.println("----Sort by name------");
			Collections.sort(arrayList, new SortByName());
			for (Student student : arrayList) {
				System.out.println(student);
			}
			break;
			case "3":System.out.println("----Sort by age------");
			Collections.sort(arrayList, new SortByAge());
			for (Student student : arrayList) {
				System.out.println(student);
			}
			break;
			case "4":System.out.println("----Sort by place------");
			Collections.sort(arrayList, new SortByPlace());
			for (Student student : arrayList) {
				System.out.println(student);
			}
			break;
			//case "5":System.exit(0);
			default:
				try {
					throw new InvalidInputException("Enter only between given option");
				}catch (InvalidInputException e) {
					System.err.println(e.getMessage());
				}
			}
			res=false;
			System.out.println("Do You want to continue Yes / No");
			String string = scanner.next();
			if(string.equalsIgnoreCase("yes")) {
				res=true;
			}else if(string.equalsIgnoreCase("No")) {
				res=false;
			}
		}
	}
}
