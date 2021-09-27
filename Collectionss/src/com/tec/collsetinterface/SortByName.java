package com.tec.collsetinterface;

import java.util.Comparator;

public class SortByName implements Comparator<EmployeeDemo> {

	@Override
	public int compare(EmployeeDemo o1, EmployeeDemo o2) {
		return o1.nameString.compareTo(o2.nameString);
	}

}
