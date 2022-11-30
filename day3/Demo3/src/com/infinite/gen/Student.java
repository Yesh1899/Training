package com.infinite.gen;

public class Student {
	int custId;
	String name;
	String city;
	double cpga;
	@Override
	public String toString() {
		return "Student [custId=" + custId + ", name=" + name + ", city=" + city + ", cpga=" + cpga + "]";
	}
	public Student(int custId, String name, String city, double cpga) {
		super();
		this.custId = custId;
		this.name = name;
		this.city = city;
		this.cpga = cpga;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
