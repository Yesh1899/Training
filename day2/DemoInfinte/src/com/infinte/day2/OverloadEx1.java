package com.infinte.day2;

public class OverloadEx1 {
	public void show(int x) {
		System.out.println("method w.r.t int "+ x);
		
	}
	public void show(double x) {
		System.out.println("method w.r.t double"
				+ " "+ x);
		
	}
	public void show(String x) {
		System.out.println("method w.r.t string "+ x);
		
	}

	public static void main(String[] args) {
		OverloadEx1 obj = new OverloadEx1();
		obj.show("hi");
		// TODO Auto-generated method stub

	}

}
