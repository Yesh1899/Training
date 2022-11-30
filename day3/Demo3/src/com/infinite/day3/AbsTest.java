package com.infinite.day3;

abstract class  Vehicle{
	abstract void name();
	abstract void type();
	
}
class Duke extends Vehicle{

	@Override
	void name() {
		System.out.println("name is duke");
		// TODO Auto-generated method stub
		
	}

	@Override
	void type() {
		System.out.println("type is 2wheeler");
		// TODO Auto-generated method stub
		
	}
	
}
class Bmw extends Vehicle{

	@Override
	void name() {
		System.out.println("name is bmw");
		// TODO Auto-generated method stub
		
	}

	@Override
	void type() {
		System.out.println("type is 4 wheeler");
		// TODO Auto-generated method stub
		
	}
	
}


public class AbsTest {
	public static void main(String[] args) {
		Vehicle[] arr = new Vehicle[]{
				new Duke(),
				new Bmw()
		};
		for (Vehicle v : arr) {
			v.name();
			v.type();
			
		}
	}
	

}
