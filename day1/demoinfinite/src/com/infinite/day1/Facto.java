package com.infinite.day1;

public class Facto {
	public void calc(int n) {
		
		int f=1;
		int i=1;
		while(i<=n){
			f=f*i;
			i++;
		}
		System.out.println("factorial  "+ f);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		Facto obj = new Facto();
		obj.calc(n);

	}

}
