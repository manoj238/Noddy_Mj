package com.tec.collsetinterface;

import java.util.Comparator;

public class SortBySalary implements Comparator<EmployeeDemo> {

	@Override
	public int compare(EmployeeDemo o1, EmployeeDemo o2) {
		return (int) (o1.sal-o2.sal);
	}

}
