package com.infinite.inh;
class First{
	public void show() {
		System.out.println("show from class");
		
	}
	
}
class Second extends First{
	public void display() {
		System.out.println("display method");
		
	}
}

public class InhDemo {
	//int i;
	public static void main(String[] args) {
		Second j = new Second();
		j.display();
		j.show();
		//System.out.println(new InhDemo().i);
	}

}

