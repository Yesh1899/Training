package com.infinite.day3;
abstract class Training{
	abstract void name();
	abstract void email();
	
}
class Yeshwanth extends Training{

	@Override
	void name() {
		System.out.println("name is yeshwanth");
		
	}

	@Override
	void email() {
		System.out.println("gmail is k.yeshwanth@gmail.com");
		
	}
	
}
class Yeshu extends Training{

	@Override
	void name() {
		System.out.println("name is yeshu");
		
	}

	@Override
	void email() {
		System.out.println("gmail is yeshwanth031@gmail.com");
		
	}
	
}
class Yesh extends Training{

	@Override
	void name() {
		System.out.println("name is yesh");
		
	}

	@Override
	void email() {
		System.out.println("gmail is yesh@gmail.com");
		
	}
	
}
public class AbsDemo {
	public static void main(String[] args) {
		Training[] arr = new Training[]{
				new Yesh(),
				new Yeshu(),
				new Yeshwanth()
		};
		for (Training t : arr) {
			t.name();

			t.email();
			
		}
	}

}
