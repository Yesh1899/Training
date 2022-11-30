package com.infinite.day1;

public class CaseExample {
	public void show(int n) {
		switch(n){
		case 1:
			System.out.println("i am yesh");
		break;
		case 2:
			System.out.println("i am yeshu");
		break;
		case 3:
			System.out.println("i am yeshwanth");
		break;
		default:
			System.out.println("invalid");
		}
		
	}

	public static void main(String[] args) {
		int n=8;
		CaseExample obj = new CaseExample();
		obj.show(n);

	}

}
