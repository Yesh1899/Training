package com.infinite.day1;

public class EvenNumber {
	public void show(int n) {
		int i=0;
		System.out.println("even numbers are");

		while(i<n){
			i=i+2;
			System.out.println(i);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20;
		EvenNumber obj = new EvenNumber();
		obj.show(n);

	}

}
