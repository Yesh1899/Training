package com.infinte.day2;

public class Student {
	int sno;
	String name;
	String city;
	double cgpA;
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", city=" + city + ", cgpA=" + cgpA + "]";
	}
	public Student(int sno, String name, String city, double cgpA) {
		this.sno = sno;
		this.name = name;
		this.city = city;
		this.cgpA = cgpA;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	

}
