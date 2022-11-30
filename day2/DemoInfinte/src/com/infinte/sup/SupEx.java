package com.infinte.sup;

class First{
	public void show() {
		System.out.println("show from class");
		
	}
	
}
class Second extends First{
	public void show() {
		super.show();
		System.out.println("display method");
		
	}
}

public class SupEx {
	public static void main(String[] args) {
		Second obj = new Second();
		obj.show();
	
	}

}
