package com.infinite.cols;

public class Customer {
	int custId;
	String name;
	String city;
	double premium;
	public Customer(int custId, String name, String city, double premium) {
		super();
		this.custId = custId;
		this.name = name;
		this.city = city;
		this.premium = premium;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + ", city=" + city + ", premium=" + premium + "]";
	}
	

}
