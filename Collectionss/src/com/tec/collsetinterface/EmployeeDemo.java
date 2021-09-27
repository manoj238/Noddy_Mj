package com.tec.collsetinterface;

public class EmployeeDemo implements Comparable<EmployeeDemo> {
	int id;
	String nameString;
	double sal;
	public EmployeeDemo(int id, String nameString, double sal) {
		this.id = id;
		this.nameString = nameString;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "EmployeeDemo [id=" + id + ", nameString=" + nameString + ", sal=" + sal + "]";
	}
	@Override
	public int compareTo(EmployeeDemo o) {
		return this.id-o.id;
	}
}
