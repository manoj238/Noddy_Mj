package com.te.comparator;

import java.util.Comparator;

public class SortByPlace implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.place.compareTo(o2.place);
	}

}
