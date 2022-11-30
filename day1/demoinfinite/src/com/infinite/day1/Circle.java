package com.infinite.day1;

public class Circle {
	public void calc(double radius) {
		double area,circ;
		area=3.14*radius*radius;
		circ =2*3.14*radius;
		System.out.println("area is " + area);
		System.out.println("circ is " + circ);
	}

	public static void main(String[] args) {
		double radius=14;
		Circle obj = new Circle();
		obj.calc(radius);
	}

}
