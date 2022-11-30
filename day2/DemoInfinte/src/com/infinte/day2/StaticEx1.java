package com.infinte.day2;

public class StaticEx1 {
	static int count;
	public void increament() {
		count++;
		
	}
	public void show() {
		System.out.println(count);
		
	}

	public static void main(String[] args) {
		StaticEx1 obj = new StaticEx1();
		StaticEx1 obj1 = new StaticEx1();
		StaticEx1 obj2 = new StaticEx1();
		obj.increament();
		obj1.increament();
		obj2.increament();
		obj.show();
	}

}
